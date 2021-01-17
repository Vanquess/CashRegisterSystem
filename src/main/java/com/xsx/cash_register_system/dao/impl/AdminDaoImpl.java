package com.xsx.cash_register_system.dao.impl;

import com.sun.javaws.jnl.XMLUtils;
import com.xsx.cash_register_system.dao.AdminDao;

import javax.swing.text.Document;
import java.util.List;

public class AdminDaoImpl implements AdminDao {

    @Override
    public List selectById(int id, String password) {

//        try{
//            Document document = XMLUtils.getDocument();
//            Element e = (Element) document.selectSingleNode("//user[@userName='"+userName+"' and @userPwd='"+userPwd+"']");
//            if(e==null){
//                return null;
//            }
//            User user = new User();
//            user.setId(e.attributeValue("id"));
//            user.setEmail(e.attributeValue("email"));
//            user.setUserPwd(e.attributeValue("userPwd"));
//            user.setUserName(e.attributeValue("userName"));
//            String birth = e.attributeValue("birthday");
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            user.setBirthday(sdf.parse(birth));
//
//            return user;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        return null;
    }
}
