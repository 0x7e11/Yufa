package com.example.Yufa;
import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class HelloController {

    String website = "";
    String google = "https://www.google.com/search?q=";
    String sensitivity_parameter_content = "";
    String Editor_content = "";
    String Background_registration_content = "";
    String Sensitive_pages_content = "";
    String File_upload_content = "";
    String Exposed_files_content = "";
    String information_leakage_content = "";
    String Exposed_Text_content = "";



//    @FXML
//    private Button Background_registration_Jump_But;

    @FXML
    private Button Background_registration_copy_But;

    @FXML
    private TextArea Background_registration_id;

    @FXML
    private TextField DomainNameFieid;

    @FXML
    private Button Editor_Jump_But;

    @FXML
    private Button Editor_copy_But;

    @FXML
    private TextArea Editor_id;

    @FXML
    private Button Exposed_Text_Jump_But;

    @FXML
    private Button Exposed_Text_copy_But;

    @FXML
    private TextArea Exposed_Text_id;

    @FXML
    private Button Exposed_files_Jump_But;

    @FXML
    private Button Exposed_files_copy_But;

    @FXML
    private TextArea Exposed_files_id;

    @FXML
    private Button File_upload_Jump_But;

    @FXML
    private Button File_upload_copy_But;

    @FXML
    private TextArea File_upload_id;

    @FXML
    private Button Sensitive_pages_Jump_But;

    @FXML
    private Button Sensitive_pages_copy_But;

    @FXML
    private TextArea Sensitive_pages_id;

//    @FXML
//    private Button information_leakage_Jump_But;

    @FXML
    private Button information_leakage_copy_But;

    @FXML
    private TextArea information_leakage_id;

    @FXML
    private Button sensitivity_parameter_Jump_But7;

    @FXML
    private Button sensitivity_parameter_copy_But;

    @FXML
    private TextArea sensitivity_parameter_id;

    @FXML
    private Button shengchengBut;

    @FXML
    private Button qingchuBut;

    @FXML
    void Background_registration_copy(ActionEvent event) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(Background_registration_content);
        clipboard.setContent(content);
    }

    @FXML
    void Editor_copy(ActionEvent event) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(Editor_content);
        clipboard.setContent(content);
    }


    @FXML
    void Exposed_files_copy(ActionEvent event) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(Exposed_files_content);
        clipboard.setContent(content);
    }

    @FXML
    void File_upload_copy(ActionEvent event) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(File_upload_content);
        clipboard.setContent(content);
    }

    @FXML
    void Sensitive_pages_copy(ActionEvent event) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(Sensitive_pages_content);
        clipboard.setContent(content);
    }

    @FXML
    void information_leakage_copy(ActionEvent event) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(information_leakage_content);
        clipboard.setContent(content);
    }

    @FXML
    void sensitivity_parameter_copy(ActionEvent event) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(sensitivity_parameter_content);
        clipboard.setContent(content);
    }


    @FXML
    void Exposed_Text_copy(ActionEvent event) {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(Exposed_Text_content);
        clipboard.setContent(content);

    }

    @FXML
    void Exposed_Text_Jump(ActionEvent event) {
        try {
            String websiteUR = google + URLEncoder.encode(Exposed_Text_content);
            Desktop.getDesktop().browse(new URI(websiteUR));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void information_leakage_Jump(ActionEvent event) {
        try {
            String websiteUR = google + URLEncoder.encode(information_leakage_content,"utf-8");//避免编码乱码
            Desktop.getDesktop().browse(new URI(websiteUR));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Exposed_files_Jump(ActionEvent event) {
        try {
            String websiteUR = google + URLEncoder.encode(Exposed_files_content);
            Desktop.getDesktop().browse(new URI(websiteUR));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void File_upload_Jump(ActionEvent event) {
        try {
            String websiteUR = google + URLEncoder.encode(File_upload_content);
            Desktop.getDesktop().browse(new URI(websiteUR));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Sensitive_pages_Jump(ActionEvent event) {
        try {
            String websiteUR = google + URLEncoder.encode(Sensitive_pages_content);
            Desktop.getDesktop().browse(new URI(websiteUR));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Background_registration_Jump(ActionEvent event) {
        try {
            String websiteUR = google + URLEncoder.encode(Background_registration_content,"utf-8");
            Desktop.getDesktop().browse(new URI(websiteUR));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void Editor_Jump(ActionEvent event) {
        try {
            String websiteUR = google + URLEncoder.encode(Editor_content);
            Desktop.getDesktop().browse(new URI(websiteUR));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void sensitivity_parameter_Jump(ActionEvent event) {
        try {
            String websiteUR = google + URLEncoder.encode(sensitivity_parameter_content);
            Desktop.getDesktop().browse(new URI(websiteUR));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void shengcheng(ActionEvent event) {
        website = this.DomainNameFieid.getText().trim();
        Exposed_Text_content = "site:"+website+" filetype:txt OR filetype:xls OR filetype:xlsx OR filetype:doc OR filetype:docx OR filetype:pdf";
        information_leakage_content = "site:"+website+" ( \"密码\" OR \"学号\" OR \"工号\" OR \"身份证\" OR \"手机号码\" OR \"邮箱\")";
        Exposed_files_content = "site:"+website+" filetype:mdb OR filetype:ini OR filetype:config OR filetype:conf OR filetype:zip OR filetype:rar OR filetype:tar OR filetype:gz OR filetype:sql OR filetype:bak OR filetype:backup OR filetype:old OR filetype:git OR filetype:svn OR filetype:swp OR filetype:bash_history OR filetype:bkf OR filetype:json";
        File_upload_content = "site:"+website+" inurl:file OR inurl:upload";
        Sensitive_pages_content = "site:"+website+" inurl:phpinfo.php OR intitle:\"phpinfo()\" OR intitle:\"Index of /\"";
        Background_registration_content = "site:"+website+" (intext:后台|登陆|用户名|密码|系统|帐号|admin|login|sys|managetem|password|username) OR (inurl:login OR inurl:admin OR register)";
        Editor_content = "site:"+website+" inurl:ueditor OR inurl:ewebeditor OR inurl:FCKeditor OR inurl:kindeditor";
        sensitivity_parameter_content = "site:"+website+" inurl:email= | inurl:phone= | inurl:password= | inurl:secret= | inurl:file=";

        this.Exposed_Text_id.setText(Exposed_Text_content);
        this.information_leakage_id.setText(information_leakage_content);
        this.Exposed_files_id.setText(Exposed_files_content);
        this.File_upload_id.setText(File_upload_content);
        this.Sensitive_pages_id.setText(Sensitive_pages_content);
        this.Background_registration_id.setText(Background_registration_content);
        this.Editor_id.setText(Editor_content);
        this.sensitivity_parameter_id.setText(sensitivity_parameter_content);

    }
    @FXML
    void qingchu(ActionEvent event) {
        DomainNameFieid.clear();
        Exposed_Text_id.clear();
        information_leakage_id.clear();
        Exposed_files_id.clear();
        Editor_id.clear();
        File_upload_id.clear();
        Sensitive_pages_id.clear();
        Background_registration_id.clear();
        sensitivity_parameter_id.clear();


    }

}
