package org.mehrabi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
@DependsOn("myApplicationListener")
public class MyPostConstructBean {

    @PostConstruct
    void postConstruct(){
        log.info("Post Construct Executed...");
    }

}
