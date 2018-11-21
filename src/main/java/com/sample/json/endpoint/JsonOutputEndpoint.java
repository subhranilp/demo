package com.sample.json.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonOutputEndpoint {

    @GetMapping("/getjsonarray")
    public String getJsonArray(){
        return "[{\"key\":\"value\",\"numbers\":[1,2,3,4,5]}, {\"key\":\"value\",\"numbers\":[4,8,6,9]}, {\"key\":\"value\",\"numbers\":[5,6,9,7,6]}]";
    }

}
