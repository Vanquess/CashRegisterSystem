package com.xsx.cash_register_system.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;

public class VerifyCodeUtil {
    public static Map<String, BufferedImage> getImg() {
        Map<String, BufferedImage> map = new HashMap<>();
        BufferedImage image = new BufferedImage(178, 40, BufferedImage.TYPE_3BYTE_BGR);
        Graphics g = image.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, 178, 40);
        g.setColor(Color.black);
        g.drawRect(0, 0, 177, 39);
        StringBuffer sb = new StringBuffer();
        Font f = new Font("隶书", Font.BOLD, 30);
        g.setFont(f);
        Random r = new Random();
        for (int i = 0; i < 5; i ++) {
            char c = (char)(r.nextInt(26) + 65);//[65,90]
            Color color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
            g.setColor(color);
            g.drawString(c+"", 40 * i, 30);
            sb.append(c);
        }
        map.put(sb.toString(), image);
        return map;
    }
    public static BufferedImage getBuff(Map<String, BufferedImage> map) {
        Set<Map.Entry<String, BufferedImage>> set = map.entrySet();
        Iterator<Map.Entry<String, BufferedImage>> it = set.iterator();
        Map.Entry<String, BufferedImage> entry = it.next();
        return entry.getValue();
    }
    public static String getKey(Map<String, BufferedImage> map) {
        Set<Map.Entry<String, BufferedImage>> set = map.entrySet();
        Iterator<Map.Entry<String, BufferedImage>> it = set.iterator();
        Map.Entry<String, BufferedImage> entry = it.next();
        return entry.getKey();
    }
}
