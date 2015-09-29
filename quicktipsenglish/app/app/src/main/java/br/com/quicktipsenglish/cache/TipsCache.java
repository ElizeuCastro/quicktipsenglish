package br.com.quicktipsenglish.cache;

import java.util.List;

import br.com.quicktipsenglish.model.Menu;
import br.com.quicktipsenglish.model.Tip;

public final class TipsCache {

    private static List<Tip> tips;
    private static List<Menu> menus;

    public static List<Tip> getTips() {
        return tips;
    }

    public static void setTips(List<Tip> tips) {
        TipsCache.tips = tips;
    }

    public static List<Menu> getMenus() {
        return menus;
    }

    public static void setMenus(List<Menu> menus) {
        TipsCache.menus = menus;
    }
}
