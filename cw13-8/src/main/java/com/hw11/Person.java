package com.hw11;

import java.util.Date;

public interface Person {

    Date getBithate();



    default Integer age(){
        return new Date().getYear();
    }

}
