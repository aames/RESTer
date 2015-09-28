package rester.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Andrew
 */
public class RestConnection {

    public RestConnection() {

    }

    public String sendRestRequest(String urlAsString, String method, 
            String payload) {
        String line;
        StringBuilder jsonString = new StringBuilder();
        try {

            URL url = new URL(urlAsString);
            //@TODO escape the double quotes in json string
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.setDoOutput(true);
            connection.setRequestMethod(method);
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            try (OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream(), "UTF-8")) {
                writer.write(payload);
            }
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                while ((line = br.readLine()) != null) {
                    jsonString.append(line);
                }
            }
            connection.disconnect();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return jsonString.toString();
    }
}

