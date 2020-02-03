package info.xpanda.labs.sofa.ark.plugin.apple.impl;

import info.xpanda.labs.sofa.ark.plugin.apple.facade.AppleService;

/**
 * @author Paul Jiang
 * @since 20200203
 */
public class AppleServiceImpl implements AppleService {
    @Override
    public String message() {
        return "apple";
    }
}
