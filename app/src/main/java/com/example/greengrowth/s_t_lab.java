package com.example.greengrowth;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class s_t_lab extends AppCompatActivity {

    ImageButton s_t_back;

    Spinner sp;
    String name[] = {"Ahmedabad","Amreli","Anand","Banas Kantha","Bharuch","Bhavnagar","Chootaudepur","Dahod","Dang","Gandhinagar","Girsomnath","Jamnagar","Junagadh","Kachchh","Kheda","Mahesana","Morbi","Narmada","Navsari","Panch Mahals","Patan","Porbandar","Rajkot","Sabar Kantha","Surat","Surendranagar","Tapi","Vadodara","Valsad"};
    ArrayAdapter<String> arrayAdapter;
    RecyclerView display_data;
    String record = "";
    List<spinneritem> mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_t_lab);

        s_t_back = findViewById(R.id.s_t_lab_bk);

        mlist = new ArrayList<>();
        display_data = findViewById(R.id.display_result);
        sp =findViewById(R.id.spinner);

        s_t_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, name);
        sp.setAdapter(arrayAdapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        record = "Ahmedabad";
                        break;

                    case 1:
                        record = "Amreli";
                        break;

                    case 2:
                        record = "Anand";
                        break;

                    case 3:
                        record = "Banas Kantha";
                        break;

                    case 4:
                        record = "Bharuch";
                        break;

                    case 5:
                        record = "Bhavnagar";
                        break;
                    case 6:
                        record = "Chottaudepur";
                        break;

                    case 7:
                        record = "Dahod";
                        break;

                    case 8:
                        record = "Dang";
                        break;
                    case 9:
                        record = "Gandhinagar";
                        break;

                    case 10:
                        record = "Girsomnath";
                        break;

                    case 11:
                        record = "Jamnagar";
                        break;
                    case 12:
                        record = "Junagadh";
                        break;

                    case 13:
                        record = "Kachchh";
                        break;

                    case 14:
                        record = "Kheda";
                        break;
                    case 15:
                        record = "Mahesana";
                        break;

                    case 16:
                        record = "Morbi";
                        break;

                    case 17:
                        record = "Narmada";
                        break;
                    case 18:
                        record = "Navsari";
                        break;

                    case 19:
                        record = "Panch Mahals";
                        break;

                    case 20:
                        record = "Patan";
                        break;
                    case 21:
                        record = "Porbandar";
                        break;

                    case 22:
                        record = "Rajkot";
                        break;

                    case 23:
                        record = "Sabar Kantha";
                        break;

                    case 24:
                        record = "Surat";
                        break;

                    case 25:
                        record = "Surendranagar";
                        break;
                    case 26:
                        record = "Tapi";
                        break;

                    case 27:
                        record = "Vadodara";
                        break;

                    case 28:
                        record = "Valsad";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


    public void displayresult(View view) {
        if (record.toString().equals("Ahmedabad"))
        {
            mlist.clear();
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE, AHMEDABAD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SOIL TESTING LABORATORY, JETALPUR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("K.K.SHASHTRI EDU.CAMPUS", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("K K SHAH JARODAVALA MANINAGAR SCIENCE COLLEGE RAMB", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("K K SHAH JARODAVALA SCIENCE COLLEGE AHMEDABAD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL AHMEDABAD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC JETALPUR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KRISHI VIGYAN KENDRA,AAU,ARNEJ", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("M G SCIENCE INSTITUTE, AHMEDABAD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL, AHMEDABAD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("XEVIERS SCIENCE COLLAGE-AHMEDABAD", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Amreli"))
        {
            mlist.clear();
            mlist.add(new spinneritem("KAMANI SCIENCE AND PRATAPRAL ARTS COLLEGE AMRELI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KRUSHI VIGYAN KENDRA AMRELI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE OFFICE, AMRELI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KAMANI SCIENCE COLLEGE AND PRATAPRAY ARTS COLLEGE", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC, AMRELI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC,SAVARKUNDLA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC,RAJULA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KAMANI SCIENCE COLLEGE & PRATAPAL ARTS COLLEGE, AMRELI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL AMRELI", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Anand"))
        {
            mlist.clear();
            mlist.add(new spinneritem("STL,BORSAD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE OFFICE,LABORATOR", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Banas Kantha"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC DESSA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC DHANERA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC THARAD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC PALANPUR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC THARA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL DEESA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC, THARA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE SOIL TESTING LAB", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC SARADAR", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Bharuch"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC AMOD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("CEOBHARUCH", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ARS, TANCHHA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("PRINCIPLE COLLEGE OF AGRICULTURE,NAU,MAKTAMPUR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("AGRICULTURE RES STATION,TANCHHA,BHARUCH", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC ANKLESHVAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC JHAGADIA", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Bhavnagar"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC MAHUVA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL BHAVNAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE OFFICE, BHAVNAGAR", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Chottaudepur"))
        {
            mlist.clear();
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE OFFICE, CHOTTAUDEPUR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE OFFICE, SOIL,CHH", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Dahod"))
        {
            mlist.clear();
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE OFFICE, DAHOD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC DAHOD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC ZHALOD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("NAVJIVAN SCIENCE COLLAGE DAHOD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SOIL TESTING LABORATORY DAHOD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SCIENCE COLLAGE-SOIL TESTING LABORATORY NAVJIVAN", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }


        else if (record.toString().equals("Dang"))
        {
            mlist.clear();
            mlist.add(new spinneritem("KRUSHI VIGYAN KENDRA,WAGHAL,DANG", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Gandhinagar"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC KALOL", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC RANDHEJA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("GLDC GANDHINAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KVK GANDHINAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL GANDHINAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SOIL TESTING LABORATORIES,GANDHINAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL-GUJRAT STATE LAND DEVELOPMENT CORPORATION LTD.", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("CORDET-IFFCO", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("INDIAN FARMERS FERTILIZERS CO OPERATIVES LTD. KALO", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Girsomnath"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC-KODINAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC NH 8E", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Jamnagar"))
        {
            mlist.clear();
            mlist.add(new spinneritem("OFFICE OF ASSISTANT DIRECTOR OF AGRICULTURE GOVERN", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SOIL TESTING LABORATORY,JAMNAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SCIENCE COLLAGE(STL)", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC HAPA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("D K V ARTS SCIENCE COLLAGE JAMNAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL JAMNAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KVK JAMNAGAR", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }


        else if (record.toString().equals("Junagadh"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC VISAVADAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL JUNAGADH", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("LAGHUKRUSHIBHAVAN", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("THE AGRICULTURE PRODUCE MARKET COMMITTEE VISAVAD", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Kachchh"))
        {
            mlist.clear();
            mlist.add(new spinneritem("SOIL TESTING LABORATORY,BHUJ-KUTCHH", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("TOLANI SCIENCE COLLAGE", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("THE AGRICULTURE PRODUCE MARKET COMMITTEE NANDASAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SCIENCE COLLAGE-SOIL TESTING LABORATORY KUTCHH UNI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC RAPAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KUTCHH UNIVERSITY BHUJ", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL BHUJ", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }


        else if (record.toString().equals("Kheda"))
        {
            mlist.clear();
            mlist.add(new spinneritem("STL THASRA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE SOIL TESTING LAB", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Mahesana"))
        {
            mlist.clear();
            mlist.add(new spinneritem("SCIENCE COLLAGE-STL,PRAMUKH SWAMI SCIENCE AND H D", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC VIJAPUR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("GOVERNMENT SCIENCE COLLAGE VADNAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("P S SCIENCE H D PATEL ARTS COLLAGE KADI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL PILVAI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("MN SCIENCE COLLAGE VISANAGAR DIST MAHESANA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KRISHI VIGYAN KENDRA,GANPATVIDHYANAGAR,MAHESANA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SOIL TESTING LABORATORY,OPP.JAY PRABUGINNING", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("M N COLLAGE STATION ROAD", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Morbi"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC-HALAVAD", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Narmada"))
        {
            mlist.clear();
            mlist.add(new spinneritem("KRUSHI VIGYAN KENDRA,DEDIAPADA,NARMADA", "Soil Testing Labroratories", "", "2649-234501"));
            mlist.add(new spinneritem("KVK DEDIAPADA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("RAJPIPLA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC-DEDIAPADA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF RAJPIPLA,DI-NARMADA", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Navsari"))
        {
            mlist.clear();
            mlist.add(new spinneritem("KVK NAVSARI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("DEPART OF SOIL SCL,ASPEE COLLE OF HORTI & FORESTRY", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SOIL AND WATER MANAGEMENT RESEARCH UNIT", "Soil Testing Labroratories", "", "2637-292103"));
            mlist.add(new spinneritem("KRUSHI VIGYAN KENDRA,NAU,NAVSARI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("RS SOIL SCIENCE", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("DEP OF SOIL SCIENCE AND AGRICULTURE CHEMISTRY,NMCA", "Soil Testing Labroratories", "", "02637-282771"));
            mlist.add(new spinneritem("ASSOCIATE PROF,DEP OF SOIL SCIENCE,ASPEE COLLAGE", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("PROFESSOR & HEAD, DEPARTMENT OF CHEMISTRY,NMCA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("RESEARCH SCIENTIST,SOIL SCIENCE, NAU", "Soil Testing Labroratories", "", "2637-282033"));
            mlist.add(new spinneritem("RS,SWMRU", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL VANSADA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE OFFICE, VANSDA", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Panch Mahals"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC-GODHARA", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Patan"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC-PATAN", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SHETH M N SCIENCE COLLEGE PATAN", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("THE AGRICULTURE PRODUCE MARKET COMMITTEE PATAN", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("THE AGRICULTURE PRODUCE MARKET COMMITTEE-SIDHPUR", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Porbandar"))
        {
            mlist.clear();
            mlist.add(new spinneritem("MD SCIENCE COLLAGE PORBANDAR", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Rajkot"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC-GONDAL", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("H HB KOTAK INSTITUTE OF SCIENCE RAJKOT", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("MATRUSHRI VIRBAI SCIENCE COLLAGE,RAJKOT", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL RAJKOT", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("VIRANI SCIENCE COLLAGE RAJKOT", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("DRY FARMING RESEARCH STATION, JAU, TARGHADIYA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SOIL TESTING LABORATORY", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SHREE MANJIBHAI VIRANI AND SMT NAVALBEN VIRANI SCIENCE", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("H & H.B KOTAK SCIENCE COLLAGE", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Sabar Kantha"))
        {
            mlist.clear();
            mlist.add(new spinneritem("STL KHEDBRAHMA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC KHEDBRAHMA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("GOVERMENT SCIENCE COLLAGE IDAR", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Surat"))
        {
            mlist.clear();
            mlist.add(new spinneritem("SOIL TESTING LABORATORY ASSISTANT DIRECTOR OF AGR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC-SURAT", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL BARDOLI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KRUSHI VIGYAN KENDRA,ATHWA LINES,SURAT", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("RS MAIN COTTON RESEARCH STATION", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("RESEARCH SCIENTIST,MAIN COTT RES STA,NAU", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KVK SURAT", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Surendranagar"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC WADHWAN", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL SURENDRANAGAR", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SOIL TESTING LABORATORY, KHERALI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC WADHWAN GIDC", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Tapi"))
        {
            mlist.clear();
            mlist.add(new spinneritem("KVK,NAU,VYARA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL VYARA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("ASSISTANT DIRECTOR OF AGRICULTURE OFFICE, TAPI", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KRUSHI VIGYAN KENDRA,VYARA,TAPI", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

        else if (record.toString().equals("Vadodara"))
        {
            mlist.clear();
            mlist.add(new spinneritem("AGRICULTURE PRODUCE MARKETING COMMITEE-KARJAN", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("AGRICULTURE PRODUCE MARKETING COMMITEE-VADODARA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("SOIL TESTING LABORATORY GSFC", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("KRUSHI VIGYAN KENDRA,VADODARA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("GUJARAT STATE FERTILIZERS CHEMICALS LTD", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC KARJAN", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("APMC VADODARA", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }


        else if (record.toString().equals("Valsad"))
        {
            mlist.clear();
            mlist.add(new spinneritem("APMC KAPRADA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("AGRICULTURE EXPERIMENTAL STATION,NAU", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("RSPAIRA", "Soil Testing Labroratories", "", ""));
            mlist.add(new spinneritem("STL PARDI", "Soil Testing Labroratories", "", ""));
            spinneradapter.Adapter adapter=new spinneradapter.Adapter(this,mlist);
            display_data.setAdapter(adapter);
            display_data.setLayoutManager(new LinearLayoutManager(this));
        }

    }
}
