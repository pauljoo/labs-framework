package info.xpanda.labs.framework.conflict.plugin;

import info.xpanda.labs.framework.biz.provider.BizFacadeImpl;

/**
 * @author Paul Jiang
 * @since 20200203
 */
public class ConflictNoSuchMethodImpl implements ConflictNoSuchMethod{
    @Override
    public void conflict(){
        BizFacadeImpl.message("");
    }
}
