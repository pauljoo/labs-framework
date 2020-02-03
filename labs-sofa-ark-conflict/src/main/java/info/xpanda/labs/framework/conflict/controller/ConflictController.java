package info.xpanda.labs.framework.conflict.controller;

import com.alipay.sofa.ark.spi.service.ArkInject;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import info.xpanda.labs.framework.biz.facade.BizFacade;
import info.xpanda.labs.framework.conflict.plugin.ConflictNoSuchMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConflictController {
    @SofaReference
    private BizFacade bizFacade;

    @ArkInject
    private ConflictNoSuchMethod conflictNoSuchMethod;

    @RequestMapping("/conflict")
    public String conflict(){
        // 加载Class
        bizFacade.conflict();

        conflictNoSuchMethod.conflict();
        return "conflict";
    }
}
