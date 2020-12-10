package com.example.n2thiagocabralhttp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.io.IOException;


public class ConexaoApi {
    public static String getJsonFromApi(String url){
        String resultado = "";
        try {
            URL apiEnd = new URL(url);
            HttpURLConnection conexao;

            conexao = (HttpURLConnection) apiEnd.openConnection();
            conexao.setRequestMethod("GET");
            conexao.setReadTimeout(15000);
            conexao.setConnectTimeout(15000);
            conexao.connect();

            int codigoResposta = conexao.getResponseCode();
            InputStream is;
            if (codigoResposta == HttpURLConnection.HTTP_OK) {
                is = conexao.getInputStream();
            } else {
                is = conexao.getErrorStream();
            }

            resultado = converterInputStreamToString(is);
            is.close();
            conexao.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    private static String converterInputStreamToString(InputStream is) {
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader br;
            String linha;

            br = new BufferedReader(new InputStreamReader((is)));
            while ((linha = br.readLine())!=null) {
                buffer.append(linha);
            }

            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        return buffer.toString();
    }
}
