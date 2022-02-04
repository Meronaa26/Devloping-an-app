package Task;

import lombok.*;

//@ToString
//@Getter
//@Setter   ==> for the above three @Data will be enough
@Data
@Builder
// @Bulider ==> generates an @AllArgConstractor unless there is another @XConstructor
// Lambda is a value so we need somthing to be implememted , that's why we need interace with lambda



public class Orange {

    private int weight ;
    private Color color;

}
