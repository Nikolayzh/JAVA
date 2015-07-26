package com.nik_zh.rzhdrasp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
    String[] otprav = {"Кисловодск", "Минутка", "Подкумок", "Белый Уголь", "Ессентуки", "Золотушка", "Скачки",
            "Новопятигорск", "Пятигорск", "Лермонтовская", "Машук", "Иноземцево","Бештау","Змейка","5й километр", "3й километр",
            "Минеральные воды"};
    String[] naznach = { "Минеральные воды","3й километр","5й километр","Змейка","Бештау","Иноземцево","Машук","Лермонтовская","Пятигорск",
            "Новопятигорск", "Скачки","Золотушка","Ессентуки","Белый Уголь","Подкумок",  "Минутка", "Кисловодск"};
        WebView webView;
    String url, url1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // адаптер
        Spinner spin = (Spinner) findViewById(R.id.spin);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, otprav);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);


        Spinner spin2 = (Spinner) findViewById(R.id.spin2);
        ArrayAdapter<String> bb = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, naznach);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(bb);
        spin2.setOnItemSelectedListener(new RaspSpinnerClass());
        spin.setOnItemSelectedListener(new RaspSpinnerClass());



    }
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id ) {


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class OtpravSpinnerClass implements OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
           // Spinner spin = (Spinner) parent;

           // if (spin.getId() == R.id.spin) {
             //   Toast.makeText(getBaseContext(), "Отправление = " + position, Toast.LENGTH_SHORT).show();
            //}

            }


        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }

    class RaspSpinnerClass implements OnItemSelectedListener {
        WebView webView = (WebView) findViewById(R.id.webView);
        WebView webView2 = (WebView) findViewById(R.id.webView2);


        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Spinner spin = (Spinner)parent;
            Spinner spin2 = (Spinner) parent;


            WebSettings webSettings = webView.getSettings();
            WebSettings webSettings2 = webView2.getSettings();
            webSettings.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webView.loadUrl(url+url1);


             if (spin.getId()== R.id.spin){
                switch (position){
                    case 0:
                        url1 = "&fromName=Кисловодск";
                        webView.loadUrl(url + url1);
                break;
                    case 1:
                        url1 = "&fromName=Минутка";
                        webView.loadUrl(url + url1);
                        break;
                    case 2:
                        url1 = "&fromName=Подкумок";
                        webView.loadUrl(url + url1);
                        break;
                    case 3:
                        url1 = "&fromName=Белый+Уголь";
                        webView.loadUrl(url + url1);
                        break;
                    case 4:
                        url1 = "&fromName=Ессентуки";
                        webView.loadUrl(url + url1);
                        break;
                    case 5:
                        url1 = "&fromName=Золотушка";
                        webView.loadUrl(url + url1);
                        break;
                    case 6:
                        url1 = "&fromName=Скачки";
                        webView.loadUrl(url + url1);
                        break;
                    case 7:
                        url1 = "&fromName=Новопятигорск";
                        webView.loadUrl(url + url1);
                        break;
                    case 8:
                        url1 = "&fromName=Пятигорск";
                        webView.loadUrl(url + url1);
                        break;
                    case 9:
                        url1 = "&fromName=Лермонтовская";
                        webView.loadUrl(url + url1);
                        break;
                    case 10:
                        url1 = "&fromName=Машук";
                        webView.loadUrl(url + url1);
                        break;
                    case 11:
                        url1 = "&fromName=Иноземцево";
                        webView.loadUrl(url + url1);
                        break;
                    case 12:
                        url1 = "&fromName=Бештау";

                        webView.loadUrl(url + url1);
                        break;
                    case 13:
                        url1 = "&toName=3+км&when=&fromId=s9612962&toId=s9613196";
                        webView.loadUrl(url + url1);
                        break;
                    case 14:
                        url1 = "&toName=5+км&when=&fromId=s9612962&toId=s9613266";
                        webView.loadUrl(url + url1);
                        break;
                      }
            }
            if (spin2.getId() == R.id.spin2) {
                switch (position){
                    case 0:
                    url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Минеральные+Воды";
                        webView.loadUrl(url+url1);
                        break;
                    case 1:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=3+км";
                        webView.loadUrl(url+url1);
                        break;
                    case 2:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=5+км";
                        webView.loadUrl(url+url1);
                        break;
                    case 3:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Змейка";
                        webView.loadUrl(url+url1);
                        break;
                    case 4:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Бештау";
                        webView.loadUrl(url+url1);
                        break;
                    case 5:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Иноземцево";
                        webView.loadUrl(url+url1);
                        break;
                    case 6:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Машук";
                        webView.loadUrl(url+url1);
                        break;
                    case 7:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Лермонтовская";
                        webView.loadUrl(url+url1);
                        break;
                    case 8:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Пятигорск";
                        webView.loadUrl(url+url1);
                        break;
                    case 9:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Новопятигорск";
                        webView.loadUrl(url+url1);
                        break;
                    case 10:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Скачки";
                        webView.loadUrl(url+url1);
                        break;
                    case 11:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Золотушка";
                        webView.loadUrl(url+url1);
                        break;
                    case 12:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Ессентуки";
                        webView.loadUrl(url+url1);
                        break;
                    case 13:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Белый+уголь";
                        webView.loadUrl(url+url1);
                        break;
                    case 14:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Подкумок";
                        webView.loadUrl(url+url1);
                        break;
                    case 15:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Минутка";
                        webView.loadUrl(url+url1);
                        break;
                    case 16:
                        url = "https://t.rasp.yandex.ru/search/suburban/?toId=c11063&fromId=s9612962&toName=Кисловодск";
                        webView.loadUrl(url+url1);
                        break;

                }
            }




        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}

