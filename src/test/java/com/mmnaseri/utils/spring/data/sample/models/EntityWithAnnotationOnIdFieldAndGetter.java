package com.mmnaseri.utils.spring.data.sample.models;

import org.springframework.data.annotation.Id;

/**
 * @author Milad Naseri (milad.naseri@cdk.com)
 * @since 1.0 (4/12/16, 7:21 PM)
 */
public class EntityWithAnnotationOnIdFieldAndGetter {

    @Id
    private Object field;

    @Id
    private void getProperty() {
        //this nativeMethod is just a stub for the `property` property getter
    }

}
