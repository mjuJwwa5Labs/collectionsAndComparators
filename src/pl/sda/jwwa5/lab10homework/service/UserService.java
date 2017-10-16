package pl.sda.jwwa5.lab10homework.service;

import pl.sda.jwwa5.lab10homework.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserService {

//    private List<User> userList = new ArrayList<>();
    private Map<String,User> userMap = new TreeMap<>();

    public UserService() {
        this.userMap = createUserMap();
    }

    private Map<String,User> addToUserMap(Map<String,User> userMap, User user) {
        userMap.put(user.getLastName(),user);
        return userMap;
    }

    public void printUserMap(Map<String,User> userMap) {
        for (String mapKey : userMap.keySet()) {
            System.out.println(userMap.get(mapKey).toString());
        }
    }

    private Map<String,User> createUserMap() {
        Map<String,User> localUserMap = new TreeMap<>();

        localUserMap = addToUserMap(localUserMap, new User("Edward_Nowak_84"));
        localUserMap = addToUserMap(localUserMap, new User("Agata_Czerwińska_6"));
        localUserMap = addToUserMap(localUserMap, new User("Bożena_Jasińska_96"));
        localUserMap = addToUserMap(localUserMap, new User("Justyna_Sikora_14"));
        localUserMap = addToUserMap(localUserMap, new User("Stefania_Cieślak_20"));
        localUserMap = addToUserMap(localUserMap, new User("Katarzyna_Krawczyk_93"));
        localUserMap = addToUserMap(localUserMap, new User("Anna_Andrzejewska_66"));
        localUserMap = addToUserMap(localUserMap, new User("Jan_Kucharski_35"));
        localUserMap = addToUserMap(localUserMap, new User("Andrzej_Walczak_35"));
        localUserMap = addToUserMap(localUserMap, new User("Alicja_Cieślak_78"));
//10
        localUserMap = addToUserMap(localUserMap, new User("Mariusz_Dudek_86"));
        localUserMap = addToUserMap(localUserMap, new User("Halina_Witkowska_14"));
        localUserMap = addToUserMap(localUserMap, new User("Iwona_Zawadzka_74"));
        localUserMap = addToUserMap(localUserMap, new User("Sylwia_Mazurek_79"));
        localUserMap = addToUserMap(localUserMap, new User("Magdalena_Ziółkowska_15"));
        localUserMap = addToUserMap(localUserMap, new User("Wiesław_Olszewski_32"));
        localUserMap = addToUserMap(localUserMap, new User("Ewelina_Kowalczyk_67"));
        localUserMap = addToUserMap(localUserMap, new User("Wiesława_Wieczorek_21"));
        localUserMap = addToUserMap(localUserMap, new User("Maciej_Nowicki_66"));
        localUserMap = addToUserMap(localUserMap, new User("Roman_Mazur_95"));
//20
        localUserMap = addToUserMap(localUserMap, new User("Jacek_Pawłowski_31"));
        localUserMap = addToUserMap(localUserMap, new User("Sylwia_Sobczak_45"));
        localUserMap = addToUserMap(localUserMap, new User("Adam_Ostrowski_41"));
        localUserMap = addToUserMap(localUserMap, new User("Jakub_Gajewski_13"));
        localUserMap = addToUserMap(localUserMap, new User("Genowefa_Lewandowska_83"));
        localUserMap = addToUserMap(localUserMap, new User("Patrycja_Przybylska_9"));
        localUserMap = addToUserMap(localUserMap, new User("Adam_Wilk_69"));
        localUserMap = addToUserMap(localUserMap, new User("Jolanta_Kaczmarek_42"));
        localUserMap = addToUserMap(localUserMap, new User("Renata_Stępień_97"));
        localUserMap = addToUserMap(localUserMap, new User("Jakub_Dąbrowski_45"));
//30
        localUserMap = addToUserMap(localUserMap, new User("Tomasz_Sokołowski_98"));
        localUserMap = addToUserMap(localUserMap, new User("Iwona_Stępień_44"));
        localUserMap = addToUserMap(localUserMap, new User("Józef_Głowacki_49"));
        localUserMap = addToUserMap(localUserMap, new User("Czesław_Sikorski_48"));
        localUserMap = addToUserMap(localUserMap, new User("Janina_Sawicka_73"));
        localUserMap = addToUserMap(localUserMap, new User("Beata_Andrzejewska_39"));
        localUserMap = addToUserMap(localUserMap, new User("Bożena_Michalak_75"));
        localUserMap = addToUserMap(localUserMap, new User("Władysław_Stępień_46"));
        localUserMap = addToUserMap(localUserMap, new User("Łukasz_Witkowski_7"));
        localUserMap = addToUserMap(localUserMap, new User("Halina_Kubiak_19"));
//40
        localUserMap = addToUserMap(localUserMap, new User("Magdalena_Jasińska_57"));
        localUserMap = addToUserMap(localUserMap, new User("Wanda_Wasilewska_28"));
        localUserMap = addToUserMap(localUserMap, new User("Marian_Wiśniewski_96"));
        localUserMap = addToUserMap(localUserMap, new User("Wanda_Pawłowska_77"));
        localUserMap = addToUserMap(localUserMap, new User("Tadeusz_Kowalczyk_81"));
        localUserMap = addToUserMap(localUserMap, new User("Władysław_Olszewski_51"));
        localUserMap = addToUserMap(localUserMap, new User("Kazimierz_Mazurek_54"));
        localUserMap = addToUserMap(localUserMap, new User("Anna_Wiśniewska_53"));
        localUserMap = addToUserMap(localUserMap, new User("Tomasz_Krajewski_45"));
        localUserMap = addToUserMap(localUserMap, new User("Henryk_Dudek_2"));
//50
        localUserMap = addToUserMap(localUserMap, new User("Ryszard_Sikora_81"));
        localUserMap = addToUserMap(localUserMap, new User("Paweł_Szczepański_79"));
        localUserMap = addToUserMap(localUserMap, new User("Beata_Kaczmarek_11"));
        localUserMap = addToUserMap(localUserMap, new User("Przemysław_Zalewski_79"));
        localUserMap = addToUserMap(localUserMap, new User("Mateusz_Jabłoński_0"));
        localUserMap = addToUserMap(localUserMap, new User("Izabela_Sobczak_81"));
        localUserMap = addToUserMap(localUserMap, new User("Agnieszka_Jabłońska_7"));
        localUserMap = addToUserMap(localUserMap, new User("Barbara_Głowacka_42"));
        localUserMap = addToUserMap(localUserMap, new User("Helena_Marciniak_81"));
        localUserMap = addToUserMap(localUserMap, new User("Michał_Rutkowski_67"));
//60
        localUserMap = addToUserMap(localUserMap, new User("Ewelina_Mazurek_50"));
        localUserMap = addToUserMap(localUserMap, new User("Przemysław_Sawicki_52"));
        localUserMap = addToUserMap(localUserMap, new User("Edward_Górski_80"));
        localUserMap = addToUserMap(localUserMap, new User("Wiesława_Gajewska_65"));
        localUserMap = addToUserMap(localUserMap, new User("Magdalena_Kozłowska_8"));
        localUserMap = addToUserMap(localUserMap, new User("Sebastian_Lis_10"));
        localUserMap = addToUserMap(localUserMap, new User("Mariusz_Dudek_73"));
        localUserMap = addToUserMap(localUserMap, new User("Stanisława_Kołodziej_10"));
        localUserMap = addToUserMap(localUserMap, new User("Ryszard_Kozłowski_51"));
        localUserMap = addToUserMap(localUserMap, new User("Jacek_Jabłoński_18"));
//70
        localUserMap = addToUserMap(localUserMap, new User("Kamil_Cieślak_16"));
        localUserMap = addToUserMap(localUserMap, new User("Mieczysław_Kaźmierczak_34"));
        localUserMap = addToUserMap(localUserMap, new User("Jadwiga_Olszewska_36"));
        localUserMap = addToUserMap(localUserMap, new User("Janusz_Lis_57"));
        localUserMap = addToUserMap(localUserMap, new User("Artur_Sadowski_16"));
        localUserMap = addToUserMap(localUserMap, new User("Stanisława_Tomaszewska_92"));
        localUserMap = addToUserMap(localUserMap, new User("Jan_Wysocki_83"));
        localUserMap = addToUserMap(localUserMap, new User("Agata_Rutkowska_51"));
        localUserMap = addToUserMap(localUserMap, new User("Jakub_Andrzejewski_22"));
        localUserMap = addToUserMap(localUserMap, new User("Aleksandra_Olszewska_52"));
//80


        return localUserMap;
    }


    //----------------------------


    public Map<String, User> getUserMap() {
        return userMap;
    }
}