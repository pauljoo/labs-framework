package info.xpanda.labs.sofa.ark.plugin.banana.impl;

import info.xpanda.labs.sofa.ark.plugin.banana.facade.BananaService;

/**
 * @author Paul Jiang
 * @since 20200203
 */
public class BananaServiceImpl implements BananaService{
    @Override
    public String message() {
        return "banana";
    }
}
