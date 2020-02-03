package info.xpanda.labs.framework.api.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import info.xpanda.labs.framework.biz.facade.BizFacade;
import info.xpanda.labs.framework.cat.facade.CatFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @SofaReference
    private BizFacade bizFacade;

    @SofaReference
    private CatFacade catFacade;

    @RequestMapping("/api")
    public String api(){
        System.out.println(bizFacade.message());
        System.out.println(catFacade.message());
        System.out.println(ConflictNoSuchMethod.message());
        return "api";
    }
}
