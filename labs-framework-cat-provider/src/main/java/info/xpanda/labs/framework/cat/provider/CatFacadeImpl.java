package info.xpanda.labs.framework.cat.provider;

import info.xpanda.labs.framework.cat.facade.CatFacade;

public class CatFacadeImpl implements CatFacade {

//    @Autowired
//    private BizFacade bizFacade;

    @Override
    public String message() {
        return "cat";
    }
}
