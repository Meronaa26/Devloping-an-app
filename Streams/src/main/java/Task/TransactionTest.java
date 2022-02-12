package Task;

import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {
        //1 : Find all transaction in 2011 and sort by value
        TransactionData.getAll().stream()
                .filter(trans->trans.getYear()==2011) // getting 2011 transactions
                       .sorted(comparing(Transaction::getValue))    // sorting by value
                                 .forEach(System.out::println);

        // 2: What are all the unique cities where the trader work?
        System.out.println("****************TASK 2****************");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                        .distinct().forEach(System.out::println);

        //3- Find all traders from Cambridge and sort them by name
        System.out.println("****************TASK 3****************");
              TransactionData.getAll().stream()
                      .map(Transaction::getTrader)   // getting all traders
                      .filter(trader -> trader.getCity().equals("Cambridge")) // filtering city
                          .sorted(comparing(Trader::getName)).forEach(System.out::println);   // comparing/sorting by name


        //4=Return a string of all treader's names sorted alphabetically
        System.out.println("****************TASK 4*****************");
        String result=
                   TransactionData.getAll()
                             .stream().map(trans->trans.getTrader().getName())
                                  .distinct().sorted()
                                       .reduce("",(name1, name2)->name1+name2+" ");// because it asks in a string we have to put it in concatenate
       System.out.println(result);

        //5 : Are any traders based in Milan?

        System.out.println("****************TASK 5****************");
        boolean millanBased = TransactionData.getAll().
                stream().anyMatch(trans->trans.getTrader().getCity().equals("Milan"));  //anyMatch returns true/false checks if there is an element or not 
        System.out.println(millanBased);

        //6   Print the values of all transaction  from the traders living in cambridge
        System.out.println("****************TASK 6****************");

        TransactionData.getAll().stream().filter(trans->trans.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue).forEach(System.out::println);


        //7   what is the highest value of all transactions
        System.out.println("****************TASK 7****************");
       Optional<Integer> high =TransactionData.getAll().stream()
                   .map(Transaction::getValue).reduce(Integer::max);

        System.out.println(high.get());

        //8  Find the transaction the smallest value
        System.out.println("****************TASK 8****************");
      Optional<Transaction>smValue=  TransactionData.getAll().stream()
                .reduce((t1,t2)-> t1.getValue()<t2.getValue()? t1:t2);

        System.out.println(smValue.get());

        Optional<Transaction>samllestValue =TransactionData.getAll().stream()
                                                                 .min(comparing(Transaction::getValue));

        System.out.println(samllestValue.get());


    }
}
