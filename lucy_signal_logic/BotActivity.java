package com.painel.ADM;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.InstanceIdResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class BotActivity extends AppCompatActivity {
    private AppBarLayout _app_bar;
    private CoordinatorLayout _coordinator;
    private DrawerLayout _drawer;
    private ImageView _drawer_imageview2;
    private ImageView _drawer_imageview3;
    private ImageView _drawer_imageview4;
    private ImageView _drawer_imageview7;
    private LinearLayout _drawer_linear14;
    private LinearLayout _drawer_linear15;
    private LinearLayout _drawer_linear16;
    private LinearLayout _drawer_linear17;
    private LinearLayout _drawer_linear2;
    private TextView _drawer_textview5;
    private TextView _drawer_textview6;
    private TextView _drawer_textview7;
    private TextView _drawer_textview8;
    private Toolbar _toolbar;
    private Button button1;
    /* access modifiers changed from: private */
    public Calendar calendario = Calendar.getInstance();
    private OnCompleteListener cloud_onCompleteListener;
    /* access modifiers changed from: private */
    public TextView hora1;
    /* access modifiers changed from: private */
    public TextView hora10;
    /* access modifiers changed from: private */
    public TextView hora11;
    /* access modifiers changed from: private */
    public TextView hora12;
    /* access modifiers changed from: private */
    public TextView hora13;
    /* access modifiers changed from: private */
    public TextView hora14;
    /* access modifiers changed from: private */
    public TextView hora15;
    /* access modifiers changed from: private */
    public TextView hora16;
    /* access modifiers changed from: private */
    public TextView hora17;
    /* access modifiers changed from: private */
    public TextView hora18;
    /* access modifiers changed from: private */
    public TextView hora19;
    /* access modifiers changed from: private */
    public TextView hora2;
    /* access modifiers changed from: private */
    public TextView hora20;
    /* access modifiers changed from: private */
    public TextView hora21;
    /* access modifiers changed from: private */
    public TextView hora22;
    /* access modifiers changed from: private */
    public TextView hora23;
    /* access modifiers changed from: private */
    public TextView hora24;
    /* access modifiers changed from: private */
    public TextView hora3;
    /* access modifiers changed from: private */
    public TextView hora4;
    /* access modifiers changed from: private */
    public TextView hora5;
    /* access modifiers changed from: private */
    public TextView hora6;
    /* access modifiers changed from: private */
    public TextView hora7;
    /* access modifiers changed from: private */
    public TextView hora8;
    /* access modifiers changed from: private */
    public TextView hora9;
    private LinearLayout linear106;
    private LinearLayout linear107;
    private LinearLayout linear168;
    private LinearLayout linear169;
    private LinearLayout linear170;
    private LinearLayout linear171;
    private LinearLayout linear172;
    private LinearLayout linear173;
    private LinearLayout linear174;
    private LinearLayout linear175;
    private LinearLayout linear176;
    private LinearLayout linear177;
    private LinearLayout linear178;
    private LinearLayout linear179;
    private LinearLayout linear180;
    private LinearLayout linear181;
    private LinearLayout linear182;
    private LinearLayout linear183;
    private LinearLayout linear184;
    private LinearLayout linear185;
    private LinearLayout linear186;
    private LinearLayout linear187;
    private LinearLayout linear188;
    private LinearLayout linear189;
    private LinearLayout linear190;
    private LinearLayout linear191;
    private LinearLayout linear192;
    private LinearLayout linear193;
    private LinearLayout linear194;
    private LinearLayout linear195;
    private LinearLayout linear196;
    private LinearLayout linear197;
    private LinearLayout linear198;
    private LinearLayout linear201;
    private LinearLayout linear209;
    private LinearLayout linear210;
    private LinearLayout linear213;
    private LinearLayout linear214;
    private LinearLayout linear94;
    /* access modifiers changed from: private */
    public TextView min1;
    /* access modifiers changed from: private */
    public TextView min10;
    /* access modifiers changed from: private */
    public TextView min11;
    /* access modifiers changed from: private */
    public TextView min12;
    /* access modifiers changed from: private */
    public TextView min13;
    /* access modifiers changed from: private */
    public TextView min14;
    /* access modifiers changed from: private */
    public TextView min15;
    /* access modifiers changed from: private */
    public TextView min16;
    /* access modifiers changed from: private */
    public TextView min17;
    /* access modifiers changed from: private */
    public TextView min18;
    /* access modifiers changed from: private */
    public TextView min19;
    /* access modifiers changed from: private */
    public TextView min2;
    /* access modifiers changed from: private */
    public TextView min20;
    /* access modifiers changed from: private */
    public TextView min21;
    /* access modifiers changed from: private */
    public TextView min22;
    /* access modifiers changed from: private */
    public TextView min23;
    /* access modifiers changed from: private */
    public TextView min2444444444444444444444444444;
    /* access modifiers changed from: private */
    public TextView min25;
    /* access modifiers changed from: private */
    public TextView min26;
    /* access modifiers changed from: private */
    public TextView min3;
    /* access modifiers changed from: private */
    public TextView min4;
    /* access modifiers changed from: private */
    public TextView min6;
    /* access modifiers changed from: private */
    public TextView min7;
    /* access modifiers changed from: private */
    public TextView min86yyyyyyffffcc;
    /* access modifiers changed from: private */
    public TextView segundo1;
    /* access modifiers changed from: private */
    public TextView segundo10;
    /* access modifiers changed from: private */
    public TextView segundo11;
    /* access modifiers changed from: private */
    public TextView segundo12;
    /* access modifiers changed from: private */
    public TextView segundo13;
    /* access modifiers changed from: private */
    public TextView segundo14;
    /* access modifiers changed from: private */
    public TextView segundo15;
    /* access modifiers changed from: private */
    public TextView segundo16;
    /* access modifiers changed from: private */
    public TextView segundo17;
    /* access modifiers changed from: private */
    public TextView segundo18;
    /* access modifiers changed from: private */
    public TextView segundo19;
    /* access modifiers changed from: private */
    public TextView segundo2;
    /* access modifiers changed from: private */
    public TextView segundo20;
    /* access modifiers changed from: private */
    public TextView segundo21;
    /* access modifiers changed from: private */
    public TextView segundo22hhhhhhhuuuuuuhhhhh;
    /* access modifiers changed from: private */
    public TextView segundo23;
    /* access modifiers changed from: private */
    public TextView segundo24;
    /* access modifiers changed from: private */
    public TextView segundo25;
    /* access modifiers changed from: private */
    public TextView segundo26;
    /* access modifiers changed from: private */
    public TextView segundo3;
    /* access modifiers changed from: private */
    public TextView segundo4;
    /* access modifiers changed from: private */
    public TextView segundo6;
    /* access modifiers changed from: private */
    public TextView segundo7;
    /* access modifiers changed from: private */
    public TextView segundo8;
    private TextView textview190;
    private TextView textview193;
    private TextView textview197;
    private TextView textview201;
    private TextView textview205;
    private TextView textview209;
    private TextView textview213;
    private TextView textview217;
    private TextView textview221;
    private TextView textview225;
    private TextView textview229;
    private TextView textview233;
    private TextView textview237;
    private TextView textview241;
    private TextView textview245;
    private TextView textview249;
    private TextView textview253;
    private TextView textview257;
    private TextView textview261;
    private TextView textview265;
    private TextView textview269;
    private TextView textview273;
    private TextView textview277;
    private TextView textview281;
    private TextView textview285;
    private TextView textview287;
    private TextView textview290;
    /* access modifiers changed from: private */
    public TextView textview299;
    /* access modifiers changed from: private */
    public TextView textview300;
    private TextView textview301;
    private TextView textview302;
    /* access modifiers changed from: private */
    public TextView textview303;
    private TextView textview304;
    private TextView textview305;
    private TextView textview306;
    private TextView textview307;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bot);
        initialize(bundle);
        FirebaseApp.initializeApp(this);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this._app_bar = (AppBarLayout) findViewById(R.id._app_bar);
        this._coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
        this._toolbar = (Toolbar) findViewById(R.id._toolbar);
        setSupportActionBar(this._toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        this._toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BotActivity.this.onBackPressed();
            }
        });
        this._drawer = (DrawerLayout) findViewById(R.id._drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, this._drawer, this._toolbar, R.string.app_name, R.string.app_name);
        this._drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id._nav_view);
        this.linear106 = (LinearLayout) findViewById(R.id.linear106);
        this.linear94 = (LinearLayout) findViewById(R.id.linear94);
        this.linear107 = (LinearLayout) findViewById(R.id.linear107);
        this.textview190 = (TextView) findViewById(R.id.textview190);
        this.linear168 = (LinearLayout) findViewById(R.id.linear168);
        this.linear173 = (LinearLayout) findViewById(R.id.linear173);
        this.linear178 = (LinearLayout) findViewById(R.id.linear178);
        this.linear183 = (LinearLayout) findViewById(R.id.linear183);
        this.linear188 = (LinearLayout) findViewById(R.id.linear188);
        this.linear193 = (LinearLayout) findViewById(R.id.linear193);
        this.linear198 = (LinearLayout) findViewById(R.id.linear198);
        this.linear201 = (LinearLayout) findViewById(R.id.linear201);
        this.linear209 = (LinearLayout) findViewById(R.id.linear209);
        this.linear169 = (LinearLayout) findViewById(R.id.linear169);
        this.linear170 = (LinearLayout) findViewById(R.id.linear170);
        this.linear171 = (LinearLayout) findViewById(R.id.linear171);
        this.linear172 = (LinearLayout) findViewById(R.id.linear172);
        this.hora1 = (TextView) findViewById(R.id.hora1);
        this.min1 = (TextView) findViewById(R.id.min1);
        this.textview193 = (TextView) findViewById(R.id.textview193);
        this.segundo1 = (TextView) findViewById(R.id.segundo1);
        this.hora7 = (TextView) findViewById(R.id.hora7);
        this.min86yyyyyyffffcc = (TextView) findViewById(R.id.min86yyyyyyffffcc);
        this.textview197 = (TextView) findViewById(R.id.textview197);
        this.segundo8 = (TextView) findViewById(R.id.segundo8);
        this.hora13 = (TextView) findViewById(R.id.hora13);
        this.min15 = (TextView) findViewById(R.id.min15);
        this.textview201 = (TextView) findViewById(R.id.textview201);
        this.segundo15 = (TextView) findViewById(R.id.segundo15);
        this.hora19 = (TextView) findViewById(R.id.hora19);
        this.min21 = (TextView) findViewById(R.id.min21);
        this.textview205 = (TextView) findViewById(R.id.textview205);
        this.segundo21 = (TextView) findViewById(R.id.segundo21);
        this.linear174 = (LinearLayout) findViewById(R.id.linear174);
        this.linear175 = (LinearLayout) findViewById(R.id.linear175);
        this.linear176 = (LinearLayout) findViewById(R.id.linear176);
        this.linear177 = (LinearLayout) findViewById(R.id.linear177);
        this.hora2 = (TextView) findViewById(R.id.hora2);
        this.min2 = (TextView) findViewById(R.id.min2);
        this.textview209 = (TextView) findViewById(R.id.textview209);
        this.segundo2 = (TextView) findViewById(R.id.segundo2);
        this.hora8 = (TextView) findViewById(R.id.hora8);
        this.min10 = (TextView) findViewById(R.id.min10);
        this.textview213 = (TextView) findViewById(R.id.textview213);
        this.segundo10 = (TextView) findViewById(R.id.segundo10);
        this.hora14 = (TextView) findViewById(R.id.hora14);
        this.min16 = (TextView) findViewById(R.id.min16);
        this.textview217 = (TextView) findViewById(R.id.textview217);
        this.segundo16 = (TextView) findViewById(R.id.segundo16);
        this.hora20 = (TextView) findViewById(R.id.hora20);
        this.min22 = (TextView) findViewById(R.id.min22);
        this.textview221 = (TextView) findViewById(R.id.textview221);
        this.segundo22hhhhhhhuuuuuuhhhhh = (TextView) findViewById(R.id.segundo22hhhhhhhuuuuuuhhhhh);
        this.linear179 = (LinearLayout) findViewById(R.id.linear179);
        this.linear180 = (LinearLayout) findViewById(R.id.linear180);
        this.linear181 = (LinearLayout) findViewById(R.id.linear181);
        this.linear182 = (LinearLayout) findViewById(R.id.linear182);
        this.hora3 = (TextView) findViewById(R.id.hora3);
        this.min3 = (TextView) findViewById(R.id.min3);
        this.textview225 = (TextView) findViewById(R.id.textview225);
        this.segundo3 = (TextView) findViewById(R.id.segundo3);
        this.hora9 = (TextView) findViewById(R.id.hora9);
        this.min11 = (TextView) findViewById(R.id.min11);
        this.textview229 = (TextView) findViewById(R.id.textview229);
        this.segundo11 = (TextView) findViewById(R.id.segundo11);
        this.hora15 = (TextView) findViewById(R.id.hora15);
        this.min17 = (TextView) findViewById(R.id.min17);
        this.textview233 = (TextView) findViewById(R.id.textview233);
        this.segundo17 = (TextView) findViewById(R.id.segundo17);
        this.hora21 = (TextView) findViewById(R.id.hora21);
        this.min23 = (TextView) findViewById(R.id.min23);
        this.textview237 = (TextView) findViewById(R.id.textview237);
        this.segundo23 = (TextView) findViewById(R.id.segundo23);
        this.linear184 = (LinearLayout) findViewById(R.id.linear184);
        this.linear185 = (LinearLayout) findViewById(R.id.linear185);
        this.linear186 = (LinearLayout) findViewById(R.id.linear186);
        this.linear187 = (LinearLayout) findViewById(R.id.linear187);
        this.hora4 = (TextView) findViewById(R.id.hora4);
        this.min4 = (TextView) findViewById(R.id.min4);
        this.textview241 = (TextView) findViewById(R.id.textview241);
        this.segundo4 = (TextView) findViewById(R.id.segundo4);
        this.hora10 = (TextView) findViewById(R.id.hora10);
        this.min12 = (TextView) findViewById(R.id.min12);
        this.textview245 = (TextView) findViewById(R.id.textview245);
        this.segundo12 = (TextView) findViewById(R.id.segundo12);
        this.hora16 = (TextView) findViewById(R.id.hora16);
        this.min18 = (TextView) findViewById(R.id.min18);
        this.textview249 = (TextView) findViewById(R.id.textview249);
        this.segundo18 = (TextView) findViewById(R.id.segundo18);
        this.hora22 = (TextView) findViewById(R.id.hora22);
        this.min2444444444444444444444444444 = (TextView) findViewById(R.id.min2444444444444444444444444444);
        this.textview253 = (TextView) findViewById(R.id.textview253);
        this.segundo24 = (TextView) findViewById(R.id.segundo24);
        this.linear189 = (LinearLayout) findViewById(R.id.linear189);
        this.linear190 = (LinearLayout) findViewById(R.id.linear190);
        this.linear191 = (LinearLayout) findViewById(R.id.linear191);
        this.linear192 = (LinearLayout) findViewById(R.id.linear192);
        this.hora5 = (TextView) findViewById(R.id.hora5);
        this.min6 = (TextView) findViewById(R.id.min6);
        this.textview257 = (TextView) findViewById(R.id.textview257);
        this.segundo6 = (TextView) findViewById(R.id.segundo6);
        this.hora11 = (TextView) findViewById(R.id.hora11);
        this.min13 = (TextView) findViewById(R.id.min13);
        this.textview261 = (TextView) findViewById(R.id.textview261);
        this.segundo13 = (TextView) findViewById(R.id.segundo13);
        this.hora17 = (TextView) findViewById(R.id.hora17);
        this.min19 = (TextView) findViewById(R.id.min19);
        this.textview265 = (TextView) findViewById(R.id.textview265);
        this.segundo19 = (TextView) findViewById(R.id.segundo19);
        this.hora23 = (TextView) findViewById(R.id.hora23);
        this.min25 = (TextView) findViewById(R.id.min25);
        this.textview269 = (TextView) findViewById(R.id.textview269);
        this.segundo25 = (TextView) findViewById(R.id.segundo25);
        this.linear194 = (LinearLayout) findViewById(R.id.linear194);
        this.linear195 = (LinearLayout) findViewById(R.id.linear195);
        this.linear196 = (LinearLayout) findViewById(R.id.linear196);
        this.linear197 = (LinearLayout) findViewById(R.id.linear197);
        this.hora6 = (TextView) findViewById(R.id.hora6);
        this.min7 = (TextView) findViewById(R.id.min7);
        this.textview273 = (TextView) findViewById(R.id.textview273);
        this.segundo7 = (TextView) findViewById(R.id.segundo7);
        this.hora12 = (TextView) findViewById(R.id.hora12);
        this.min14 = (TextView) findViewById(R.id.min14);
        this.textview277 = (TextView) findViewById(R.id.textview277);
        this.segundo14 = (TextView) findViewById(R.id.segundo14);
        this.hora18 = (TextView) findViewById(R.id.hora18);
        this.min20 = (TextView) findViewById(R.id.min20);
        this.textview281 = (TextView) findViewById(R.id.textview281);
        this.segundo20 = (TextView) findViewById(R.id.segundo20);
        this.hora24 = (TextView) findViewById(R.id.hora24);
        this.min26 = (TextView) findViewById(R.id.min26);
        this.textview285 = (TextView) findViewById(R.id.textview285);
        this.segundo26 = (TextView) findViewById(R.id.segundo26);
        this.button1 = (Button) findViewById(R.id.button1);
        this.textview287 = (TextView) findViewById(R.id.textview287);
        this.linear210 = (LinearLayout) findViewById(R.id.linear210);
        this.textview290 = (TextView) findViewById(R.id.textview290);
        this.textview307 = (TextView) findViewById(R.id.textview307);
        this.linear213 = (LinearLayout) findViewById(R.id.linear213);
        this.linear214 = (LinearLayout) findViewById(R.id.linear214);
        this.textview299 = (TextView) findViewById(R.id.textview299);
        this.textview301 = (TextView) findViewById(R.id.textview301);
        this.textview300 = (TextView) findViewById(R.id.textview300);
        this.textview302 = (TextView) findViewById(R.id.textview302);
        this.textview303 = (TextView) findViewById(R.id.textview303);
        this.textview304 = (TextView) findViewById(R.id.textview304);
        this.textview305 = (TextView) findViewById(R.id.textview305);
        this.textview306 = (TextView) findViewById(R.id.textview306);
        this._drawer_linear2 = (LinearLayout) linearLayout.findViewById(R.id.linear2);
        this._drawer_linear17 = (LinearLayout) linearLayout.findViewById(R.id.linear17);
        this._drawer_imageview3 = (ImageView) linearLayout.findViewById(R.id.imageview3);
        this._drawer_linear15 = (LinearLayout) linearLayout.findViewById(R.id.linear15);
        this._drawer_textview6 = (TextView) linearLayout.findViewById(R.id.textview6);
        this._drawer_textview7 = (TextView) linearLayout.findViewById(R.id.textview7);
        this._drawer_textview8 = (TextView) linearLayout.findViewById(R.id.textview8);
        this._drawer_imageview2 = (ImageView) linearLayout.findViewById(R.id.imageview2);
        this._drawer_linear14 = (LinearLayout) linearLayout.findViewById(R.id.linear14);
        this._drawer_linear16 = (LinearLayout) linearLayout.findViewById(R.id.linear16);
        this._drawer_imageview7 = (ImageView) linearLayout.findViewById(R.id.imageview7);
        this._drawer_textview5 = (TextView) linearLayout.findViewById(R.id.textview5);
        this._drawer_imageview4 = (ImageView) linearLayout.findViewById(R.id.imageview4);
        this.button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                BotActivity.this.segundo7.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo6.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo4.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo2.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo3.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo1.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.hora1.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora2.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora3.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora4.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora5.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora6.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora7.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora8.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora9.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora10.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora11.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora12.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora13.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora14.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora15.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora16.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora17.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora18.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora19.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora20.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora24.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora22.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora23.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.hora21.setText(new SimpleDateFormat("HH:").format(BotActivity.this.calendario.getTime()));
                BotActivity.this.min1.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min2.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min3.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min4.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min7.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min6.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo8.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min2.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min3.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min4.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min7.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min6.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min86yyyyyyffffcc.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min10.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo10.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min11.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo11.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min12.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo12.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min13.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo13.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min14.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo14.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min15.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo15.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min16.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo16.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min17.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo17.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min18.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo18.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min19.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo19.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min20.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo20.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min21.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo21.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min22.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo22hhhhhhhuuuuuuhhhhh.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min23.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo23.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min25.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo25.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min26.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo26.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.segundo24.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.min2444444444444444444444444444.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 59)));
                BotActivity.this.textview299.setText(String.valueOf((long) SketchwareUtil.getRandom(1, 3)));
                BotActivity.this.textview300.setText(String.valueOf((long) SketchwareUtil.getRandom(10, 59)));
                BotActivity.this.textview303.setText(String.valueOf((long) SketchwareUtil.getRandom(4, 6)));
            }
        });
        this.cloud_onCompleteListener = new OnCompleteListener<InstanceIdResult>() {
            public void onComplete(Task<InstanceIdResult> task) {
                task.isSuccessful();
                task.getResult().getToken();
                if (task.getException() != null) {
                    task.getException().getMessage();
                }
            }
        };
    }

    private void initializeLogic() {
        this.button1.setBackground(new GradientDrawable() {
            public GradientDrawable getIns(int i, int i2) {
                setCornerRadius((float) i);
                setColor(i2);
                return this;
            }
        }.getIns(35, -2818048));
    }

    public void onBackPressed() {
        if (this._drawer.isDrawerOpen((int) GravityCompat.START)) {
            this._drawer.closeDrawer((int) GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[1];
    }

    @Deprecated
    public int getRandom(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            if (checkedItemPositions.valueAt(i)) {
                arrayList.add(Double.valueOf((double) checkedItemPositions.keyAt(i)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int i) {
        return TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}
