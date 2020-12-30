package org.fullbarrows.pm;

import org.springframework.stereotype.Component;

@Component("testBean")
public class TestBean {
    public ResponseType getMessage() {
        return new ResponseType("only test!");
    }
}
