package lb.edu.liu.germanartikel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView word;
    Button der, die, das, next;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        der = findViewById(R.id.der);
        die = findViewById(R.id.die);
        das = findViewById(R.id.das);
        next = findViewById(R.id.next);
        word = findViewById(R.id.word);
        String a = "Der Bleistift Der Kuli Die Schere Der Stabsauger Das Fahrrad Der Kühlschrank Der Kinderwagen Die Waschmaschine Das Buch Der Fernseher Die Tasche Die Brille Das Heft Das Bild Das Frühstück Der Morgen Der Abend Das Abendessen Die Hausaufgabe Der Mittag Die Metzgerei Die Bäckeri Das Schwimmbad Die Bibliothek Der Kurs Die Stadtrundfahrt Der Treffpunkt Das Rathaus Die Verabredung Das Eck Die Zeitung Die Firma Die Arbeit Der Tag Die Mittagspause Die Kantine Die Nachricht Das Wochenende Die Krankheit Die Stunde Das Heute Der Apfel Das Bier Das Brot Das Fleisch Die Kartoffel Der Käse Die Milch Der Zucker Der Saft Die Marmelade Die Packung Die Flasche Der Kasten Das Ei Der Essig Das öl Der Reis Das Salz Die Zwiebel Die Gurke Der Kunde Die Tankstelle Die Vorspeise Die Hauptspeise Der Nachtisch Die Zutaten Das Angebot Die Tüte Die Tochter Der Sohn Die Mutter Der Vater Die Eltern Die Großeltern Der Bruder Die Schwester Das Geschwister Die Oma Der Ehemann Der Ausflug Der Geburtstag Das Frühling Der Herbst Der Winter Der Sommer Das Geschenk Das Fest Der Jugendliche Der Führerschein Die Leute Die Kerze Das Leben Das Kino Der Leiter Die Leiter Der Stadtplan Der Regenschirm Das Schloss Der Baum Das Gebäude Die Menschen Die Wolke Der Turm Das Fenster Die Tür Die Blume Der Eingang Die Ampel Die Sparkasse Die Straße Der Platz Die Möglichkeiten Das Schiff Das Geschäft Die Mauer Der Bahnhof Der Termin Das Gehalt Das Einkommen Der Stundenlohn Die Diele Die Heizung Der Strom Die Etage Das Geschoss Die Zeit Die Anzeige Der Zettel Die Seite Der Vermieter Der Schlüssel Die Einladung Die Tonne Der Unfall Das Konzert Die Hauptstadt Der Wecker Das Riesenrad Das Eis Die Frage Der Tagesablauf Die Aufgabe Die Sekunde Die Grüße Der Stock Die Treppe Die Raumpflegerin Der Betrieb Das Büro Die Bezahlung Die Bewerbung Die Stelle Der Beruf Der Job Der Urlaub Der Kopf Die Haare Das Auge Das Ohr Der Zahn Das Gesicht Die Nase Der Mund Die Schulter Der Arm Der Finger Die Hand Der Hals Die Brust Das Herz Der Rücken Der Bauch Das Bein Das Knie Der Fuß Der Zeh Die Salbe Die Meldung Die Apotheke Der Arzt Die Versichertenkarte Das Röntgen Der Verband Die Überweisung Der Schmerz Der Körper Das Obst Das Gemüse Die Haut Der Verein Der Fitnessraum Die Ernährung Der Husten Die Beschwerde Das Fieber Die Herberge Der Flughafen Das Flugzeug Der Flug Der Prospekt Die Ankunft Die Durchsage Die Reise Der Führer Die Übernachtung Der Koffer Das Gepäck Der Rucksack Der Ausweis Der See Die See Der Wald Das Meer Der Berg Der Aufzug Das Wetter Der Regen Der Schnee Der Angestellte Der Anzug Der Gürtel Das Hemd Die Hose Die Jacke Die Jeans Das Kleid Die Kleidung Der Mantel Der Rock Der Schal Der Schuh Die Strumpfhose Die Socke Der Stiefel Der Schutzhelm Die Halskette Die Mütze Der Handschuh Die Damenmode Der Schmuck Das Spielzeug Die Zeitschrift Die Büroartikel Das Lebensmittel Der Spiegel Das Sonderangebot Das Leder Die Braut Der Knopf Der Reißverschluss Der Fleck Der Laden Der Zustand Die Abteilung Der Hase Der Hund Die Süßigkeiten Das Licht Der Weihnachtsbaum Die Kirche Die Moschee Die Überraschung Das Feuerwerk Die Sekt Das Schwein Der Trauring Der Verwandte Die Hochzeit Die Flitterwochen Die Zukunft Das Armband Die Praline Der Kochtopf Der Gutschein Die Bevölkerung";
        String b[]= a.split(" ");
        int c = 0, d = 1;
        String words[] = new String[(b.length/2)];
        String artikel[] = new String[(b.length/2)];
        for (int i = 0; i < words.length; i++) {
            words[i] = b[d];
            artikel[i] = b[c];
            d += 2;
            c += 2;
        }
       generate(words);


        der.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAnswer(words, artikel);
            }
        });
        die.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAnswer(words, artikel);
            }
        });
        das.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAnswer(words, artikel);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                der.setBackgroundColor(Color.rgb(101, 31, 255));
                die.setBackgroundColor(Color.rgb(101, 31, 255));
                das.setBackgroundColor(Color.rgb(101, 31, 255));
                counter = 0;
                generate(words);
            }
        });

    }
    public void showAnswer(String words[], String artikel[]){
        if(counter == 0){
            String s = word.getText().toString();
            int getIndex = Arrays.asList(words).indexOf(s);
            String answer = artikel[getIndex];
            if(answer.equals("Der")){
                der.setBackgroundColor(Color.GREEN);
                die.setBackgroundColor(Color.RED);
                das.setBackgroundColor(Color.RED);
            }
            else if(answer.equals("Die")) {
                der.setBackgroundColor(Color.RED);
                die.setBackgroundColor(Color.GREEN);
                das.setBackgroundColor(Color.RED);
            }
            else{
                der.setBackgroundColor(Color.RED);
                die.setBackgroundColor(Color.RED);
                das.setBackgroundColor(Color.GREEN);
            }
            counter ++;
        }
    }

    public void generate(String a[]){
        Random rand = new Random();
        int r = rand.nextInt(a.length);
        word.setText(a[r] + "");
    }
    }

