package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import utils.FileReaderManager;
import testDataType.LoginInfo;

public class JsonDataReader {
    private final String loginFilePath = FileReaderManager.getInstance().getConfigHelper().getTestDataResourcePath() + "LoginInfo.json";
    private List<LoginInfo> loginInfoData;

    public JsonDataReader(){
        loginInfoData = getLoginData();
    }

    private List<LoginInfo> getLoginData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(loginFilePath));
            LoginInfo[] loginInfo = gson.fromJson(bufferReader, LoginInfo[].class);
            return Arrays.asList(loginInfo);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + loginFilePath);
        }finally {
            try { if(bufferReader != null) bufferReader.close();}
            catch (IOException ignore) {}
        }
    }

    public final LoginInfo getLoginInfo(String userName, String userPassword){
        for(LoginInfo login : loginInfoData) {
            if(login.userName.equalsIgnoreCase(userName)) return login;
        }
        return null;
    }



}