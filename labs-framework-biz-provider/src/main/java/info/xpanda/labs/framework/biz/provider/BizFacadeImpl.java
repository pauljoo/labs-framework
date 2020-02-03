package info.xpanda.labs.framework.biz.provider;

import info.xpanda.labs.framework.biz.facade.BizFacade;

public class BizFacadeImpl implements BizFacade {
    @Override
    public String message() {
        return "biz";
    }
}
