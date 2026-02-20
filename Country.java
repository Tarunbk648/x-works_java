class Country {

    public static String[] findStatesByCountry(String countryName){

        if(countryName.equals("India")){
            String[] states={
                "Karnataka","Tamil Nadu","Kerala","Maharashtra",
                "Telangana","Andhra Pradesh","Gujarat","Rajasthan",
                "Punjab","Haryana","Bihar","Odisha",
                "Assam","Goa","Himachal Pradesh",
                "Madhya Pradesh","Uttar Pradesh","West Bengal",
                "Sikkim","Meghalaya","Manipur","Nagaland",
                "Tripura","Arunachal Pradesh","Chhattisgarh",
                "Jharkhand","Uttarakhand","Mizoram"
            };
            return states;
        }

        else if(countryName.equals("United States")){
            String[] states={
                "California","Texas","Florida","New York",
                "Illinois","Ohio","Georgia","North Carolina",
                "Michigan","New Jersey","Virginia","Washington",
                "Arizona","Massachusetts","Tennessee",
                "Indiana","Missouri","Maryland",
                "Wisconsin","Colorado","Minnesota",
                "South Carolina","Alabama","Louisiana",
                "Kentucky","Oregon","Oklahoma",
                "Connecticut","Utah","Nevada",
                "Kansas","Arkansas","Mississippi",
                "Iowa","New Mexico","Nebraska",
                "Idaho","West Virginia","Hawaii",
                "New Hampshire","Maine","Montana",
                "Rhode Island","Delaware","South Dakota",
                "North Dakota","Alaska","Vermont","Wyoming"
            };
            return states;
        }

        else if(countryName.equals("Australia")){
            String[] states={
                "New South Wales","Victoria","Queensland",
                "Western Australia","South Australia",
                "Tasmania","Northern Territory",
                "Australian Capital Territory"
            };
            return states;
        }

        else if(countryName.equals("Canada")){
            String[] states={
                "Ontario","Quebec","British Columbia",
                "Alberta","Manitoba","Saskatchewan",
                "Nova Scotia","New Brunswick",
                "Prince Edward Island","Newfoundland and Labrador"
            };
            return states;
        }

        else if(countryName.equals("Germany")){
            String[] states={
                "Bavaria","Berlin","Hamburg","Hesse",
                "Saxony","Brandenburg","Bremen",
                "Thuringia","Saarland","Schleswig-Holstein",
                "Lower Saxony","North Rhine-Westphalia",
                "Rhineland-Palatinate","Baden-Württemberg",
                "Mecklenburg-Vorpommern","Saxony-Anhalt"
            };
            return states;
        }

        else if(countryName.equals("France")){
            String[] states={
                "Île-de-France","Provence-Alpes-Côte d'Azur",
                "Nouvelle-Aquitaine","Occitanie",
                "Hauts-de-France","Grand Est",
                "Normandy","Brittany","Bourgogne-Franche-Comté",
                "Pays de la Loire","Centre-Val de Loire","Corsica"
            };
            return states;
        }

        else if(countryName.equals("Japan")){
            String[] states={
                "Tokyo","Osaka","Kyoto","Hokkaido",
                "Aichi","Fukuoka","Hiroshima",
                "Chiba","Saitama","Hyogo",
                "Shizuoka","Okinawa"
            };
            return states;
        }

        else if(countryName.equals("Brazil")){
            String[] states={
                "São Paulo","Rio de Janeiro","Bahia",
                "Minas Gerais","Paraná","Pernambuco",
                "Ceará","Rio Grande do Sul",
                "Amazonas","Goiás"
            };
            return states;
        }

        else if(countryName.equals("China")){
            String[] states={
                "Guangdong","Beijing","Shanghai",
                "Zhejiang","Sichuan","Henan",
                "Shandong","Jiangsu",
                "Hubei","Fujian"
            };
            return states;
        }

        else if(countryName.equals("United Kingdom")){
            String[] states={
                "England","Scotland","Wales","Northern Ireland"
            };
            return states;
        }

        else if(countryName.equals("Italy")){
            String[] states={
                "Lombardy","Sicily","Veneto",
                "Emilia-Romagna","Tuscany",
                "Piedmont","Campania"
            };
            return states;
        }

        else if(countryName.equals("Spain")){
            String[] states={
                "Catalonia","Madrid","Andalusia",
                "Valencia","Galicia",
                "Basque Country","Aragon"
            };
            return states;
        }

        else if(countryName.equals("South Korea")){
            String[] states={
                "Seoul","Busan","Incheon",
                "Daegu","Daejeon","Gwangju",
                "Ulsan","Jeju"
            };
            return states;
        }

        else if(countryName.equals("Mexico")){
            String[] states={
                "Jalisco","Nuevo León","Chiapas",
                "Puebla","Yucatán","Oaxaca",
                "Veracruz","Sonora"
            };
            return states;
        }

        else if(countryName.equals("Russia")){
            String[] states={
                "Moscow","Saint Petersburg",
                "Siberia","Tatarstan",
                "Chechnya","Krasnodar"
            };
            return states;
        }

        else if(countryName.equals("South Africa")){
            String[] states={
                "Gauteng","Western Cape",
                "Eastern Cape","KwaZulu-Natal",
                "Free State","Limpopo"
            };
            return states;
        }

        else if(countryName.equals("Argentina")){
            String[] states={
                "Buenos Aires","Cordoba",
                "Santa Fe","Mendoza",
                "Tucuman","Salta"
            };
            return states;
        }

        else if(countryName.equals("Indonesia")){
            String[] states={
                "Jakarta","Bali","West Java",
                "Central Java","East Java",
                "Sumatra","Papua"
            };
            return states;
        }

        else if(countryName.equals("Saudi Arabia")){
            String[] states={
                "Riyadh","Mecca","Medina",
                "Eastern Province","Tabuk"
            };
            return states;
        }

        else if(countryName.equals("Turkey")){
            String[] states={
                "Istanbul","Ankara","Izmir",
                "Antalya","Bursa"
            };
            return states;
        }

        else if(countryName.equals("Switzerland")){
            String[] states={
                "Zurich","Geneva","Bern",
                "Basel","Lucerne"
            };
            return states;
        }

        else if(countryName.equals("Netherlands")){
            String[] states={
                "North Holland","South Holland",
                "Utrecht","Groningen","Limburg"
            };
            return states;
        }

        else if(countryName.equals("Belgium")){
            String[] states={
                "Flanders","Wallonia","Brussels"
            };
            return states;
        }

        else if(countryName.equals("Sweden")){
            String[] states={
                "Stockholm","Skåne",
                "Västra Götaland"
            };
            return states;
        }

        else if(countryName.equals("Norway")){
            String[] states={
                "Oslo","Vestland",
                "Rogaland"
            };
            return states;
        }

        else if(countryName.equals("Denmark")){
            String[] states={
                "Copenhagen","Aarhus",
                "Odense"
            };
            return states;
        }

        else if(countryName.equals("Finland")){
            String[] states={
                "Helsinki","Tampere",
                "Turku"
            };
            return states;
        }

        else if(countryName.equals("New Zealand")){
            String[] states={
                "Auckland","Wellington",
                "Canterbury"
            };
            return states;
        }

        else if(countryName.equals("Pakistan")){
            String[] states={
                "Punjab","Sindh",
                "Khyber Pakhtunkhwa","Balochistan"
            };
            return states;
        }

        else if(countryName.equals("Bangladesh")){
            String[] states={
                "Dhaka","Chittagong",
                "Khulna","Rajshahi"
            };
            return states;
        }

        else if(countryName.equals("Nepal")){
            String[] states={
                "Bagmati","Gandaki",
                "Lumbini","Province 1"
            };
            return states;
        }

        else if(countryName.equals("Sri Lanka")){
            String[] states={
                "Western","Central",
                "Southern","Northern"
            };
            return states;
        }
		
		else if(countryName.equals("Egypt")){
    String[] states={"Cairo","Giza","Alexandria","Luxor","Aswan"};
    return states;
}

else if(countryName.equals("Nigeria")){
    String[] states={"Lagos","Abuja","Kano","Kaduna","Rivers"};
    return states;
}

else if(countryName.equals("Kenya")){
    String[] states={"Nairobi","Mombasa","Kisumu","Nakuru","Eldoret"};
    return states;
}

else if(countryName.equals("Ethiopia")){
    String[] states={"Addis Ababa","Oromia","Amhara","Tigray","Somali"};
    return states;
}

else if(countryName.equals("Morocco")){
    String[] states={"Casablanca","Rabat","Marrakesh","Fes","Tangier"};
    return states;
}

else if(countryName.equals("Algeria")){
    String[] states={"Algiers","Oran","Constantine","Annaba","Blida"};
    return states;
}

else if(countryName.equals("Tunisia")){
    String[] states={"Tunis","Sfax","Sousse","Kairouan","Bizerte"};
    return states;
}

else if(countryName.equals("Ghana")){
    String[] states={"Accra","Kumasi","Tamale","Takoradi","Cape Coast"};
    return states;
}

else if(countryName.equals("Uganda")){
    String[] states={"Kampala","Gulu","Mbarara","Jinja","Mbale"};
    return states;
}

else if(countryName.equals("Tanzania")){
    String[] states={"Dodoma","Dar es Salaam","Arusha","Mwanza","Zanzibar"};
    return states;
}

else if(countryName.equals("Philippines")){
    String[] states={"Manila","Cebu","Davao","Quezon","Palawan"};
    return states;
}

else if(countryName.equals("Thailand")){
    String[] states={"Bangkok","Chiang Mai","Phuket","Pattaya","Krabi"};
    return states;
}

else if(countryName.equals("Vietnam")){
    String[] states={"Hanoi","Ho Chi Minh City","Da Nang","Hue","Hai Phong"};
    return states;
}

else if(countryName.equals("Malaysia")){
    String[] states={"Kuala Lumpur","Selangor","Penang","Johor","Sabah"};
    return states;
}

else if(countryName.equals("Singapore")){
    String[] states={"Central","East","North","North-East","West"};
    return states;
}

else if(countryName.equals("Myanmar")){
    String[] states={"Yangon","Mandalay","Naypyidaw","Bago","Shan"};
    return states;
}

else if(countryName.equals("Cambodia")){
    String[] states={"Phnom Penh","Siem Reap","Battambang","Kampot","Kandal"};
    return states;
}

else if(countryName.equals("Laos")){
    String[] states={"Vientiane","Luang Prabang","Savannakhet","Champasak","Xieng Khouang"};
    return states;
}

else if(countryName.equals("Mongolia")){
    String[] states={"Ulaanbaatar","Darkhan","Erdenet","Khentii","Orkhon"};
    return states;
}

else if(countryName.equals("Kazakhstan")){
    String[] states={"Almaty","Astana","Shymkent","Aktobe","Karaganda"};
    return states;
}

else if(countryName.equals("Uzbekistan")){
    String[] states={"Tashkent","Samarkand","Bukhara","Khiva","Andijan"};
    return states;
}

else if(countryName.equals("Afghanistan")){
    String[] states={"Kabul","Kandahar","Herat","Mazar-i-Sharif","Jalalabad"};
    return states;
}

else if(countryName.equals("Iran")){
    String[] states={"Tehran","Isfahan","Shiraz","Tabriz","Mashhad"};
    return states;
}

else if(countryName.equals("Iraq")){
    String[] states={"Baghdad","Basra","Mosul","Erbil","Najaf"};
    return states;
}

else if(countryName.equals("Israel")){
    String[] states={"Jerusalem","Tel Aviv","Haifa","Beersheba","Nazareth"};
    return states;
}

else if(countryName.equals("Jordan")){
    String[] states={"Amman","Irbid","Zarqa","Aqaba","Karak"};
    return states;
}

else if(countryName.equals("Qatar")){
    String[] states={"Doha","Al Rayyan","Al Wakrah","Al Khor","Umm Salal"};
    return states;
}

else if(countryName.equals("UAE")){
    String[] states={"Dubai","Abu Dhabi","Sharjah","Ajman","Fujairah"};
    return states;
}

else if(countryName.equals("Oman")){
    String[] states={"Muscat","Salalah","Sohar","Nizwa","Sur"};
    return states;
}

else if(countryName.equals("Kuwait")){
    String[] states={"Kuwait City","Hawalli","Farwaniya","Ahmadi","Jahra"};
    return states;
}

else if(countryName.equals("Chile")){
    String[] states={"Santiago","Valparaiso","Concepcion","La Serena","Antofagasta"};
    return states;
}

else if(countryName.equals("Peru")){
    String[] states={"Lima","Cusco","Arequipa","Trujillo","Piura"};
    return states;
}

else if(countryName.equals("Colombia")){
    String[] states={"Bogota","Medellin","Cali","Cartagena","Barranquilla"};
    return states;
}

else if(countryName.equals("Venezuela")){
    String[] states={"Caracas","Maracaibo","Valencia","Barquisimeto","Maracay"};
    return states;
}

else if(countryName.equals("Bolivia")){
    String[] states={"La Paz","Santa Cruz","Cochabamba","Sucre","Oruro"};
    return states;
}

else if(countryName.equals("Paraguay")){
    String[] states={"Asuncion","Ciudad del Este","Encarnacion","Luque","San Lorenzo"};
    return states;
}

else if(countryName.equals("Uruguay")){
    String[] states={"Montevideo","Salto","Paysandu","Rivera","Maldonado"};
    return states;
}

else if(countryName.equals("Cuba")){
    String[] states={"Havana","Santiago de Cuba","Camaguey","Holguin","Matanzas"};
    return states;
}

else if(countryName.equals("Dominican Republic")){
    String[] states={"Santo Domingo","Santiago","La Vega","San Cristobal","Puerto Plata"};
    return states;
}

else if(countryName.equals("Haiti")){
    String[] states={"Port-au-Prince","Cap-Haitien","Gonaives","Les Cayes","Jacmel"};
    return states;
}

else if(countryName.equals("Panama")){
    String[] states={"Panama City","Colon","David","Santiago","Chitre"};
    return states;
}

else if(countryName.equals("Costa Rica")){
    String[] states={"San Jose","Alajuela","Cartago","Heredia","Limon"};
    return states;
}

else if(countryName.equals("Guatemala")){
    String[] states={"Guatemala City","Quetzaltenango","Escuintla","Huehuetenango","Petén"};
    return states;
}

else if(countryName.equals("Honduras")){
    String[] states={"Tegucigalpa","San Pedro Sula","La Ceiba","Choluteca","Comayagua"};
    return states;
}

else if(countryName.equals("El Salvador")){
    String[] states={"San Salvador","Santa Ana","San Miguel","Sonsonate","La Libertad"};
    return states;
}

else if(countryName.equals("Nicaragua")){
    String[] states={"Managua","Leon","Granada","Masaya","Chinandega"};
    return states;
}

else if(countryName.equals("Jamaica")){
    String[] states={"Kingston","Montego Bay","Spanish Town","Portmore","Mandeville"};
    return states;
}

else if(countryName.equals("Iceland")){
    String[] states={"Reykjavik","Akureyri","Keflavik","Selfoss","Egilsstadir"};
    return states;
}

else if(countryName.equals("Ireland")){
    String[] states={"Dublin","Cork","Galway","Limerick","Waterford"};
    return states;
}

else if(countryName.equals("Portugal")){
    String[] states={"Lisbon","Porto","Braga","Coimbra","Faro"};
    return states;
}

else if(countryName.equals("Austria")){
    String[] states={"Vienna","Salzburg","Tyrol","Styria","Carinthia"};
    return states;
}

else if(countryName.equals("Hungary")){
    String[] states={"Budapest","Debrecen","Szeged","Miskolc","Pecs"};
    return states;
}

else if(countryName.equals("Poland")){
    String[] states={"Warsaw","Krakow","Gdansk","Wroclaw","Poznan"};
    return states;
}

else if(countryName.equals("Czech Republic")){
    String[] states={"Prague","Brno","Ostrava","Plzen","Liberec"};
    return states;
}

else if(countryName.equals("Slovakia")){
    String[] states={"Bratislava","Kosice","Presov","Zilina","Nitra"};
    return states;
}

else if(countryName.equals("Romania")){
    String[] states={"Bucharest","Cluj","Timisoara","Iasi","Brasov"};
    return states;
}

else if(countryName.equals("Bulgaria")){
    String[] states={"Sofia","Plovdiv","Varna","Burgas","Ruse"};
    return states;
}

else if(countryName.equals("Croatia")){
    String[] states={"Zagreb","Split","Rijeka","Osijek","Dubrovnik"};
    return states;
}

else if(countryName.equals("Slovenia")){
    String[] states={"Ljubljana","Maribor","Celje","Kranj","Koper"};
    return states;
}

else if(countryName.equals("Serbia")){
    String[] states={"Belgrade","Novi Sad","Nis","Kragujevac","Subotica"};
    return states;
}

else if(countryName.equals("Bosnia")){
    String[] states={"Sarajevo","Banja Luka","Tuzla","Zenica","Mostar"};
    return states;
}

else if(countryName.equals("Montenegro")){
    String[] states={"Podgorica","Niksic","Herceg Novi","Budva","Bar"};
    return states;
}

else if(countryName.equals("Albania")){
    String[] states={"Tirana","Durres","Vlore","Shkoder","Elbasan"};
    return states;
}

else if(countryName.equals("North Macedonia")){
    String[] states={"Skopje","Bitola","Tetovo","Kumanovo","Ohrid"};
    return states;
}

else if(countryName.equals("Ukraine")){
    String[] states={"Kyiv","Kharkiv","Lviv","Odessa","Dnipro"};
    return states;
}

else if(countryName.equals("Belarus")){
    String[] states={"Minsk","Gomel","Mogilev","Vitebsk","Grodno"};
    return states;
}

else if(countryName.equals("Lithuania")){
    String[] states={"Vilnius","Kaunas","Klaipeda","Siauliai","Panevezys"};
    return states;
}

else if(countryName.equals("Latvia")){
    String[] states={"Riga","Daugavpils","Liepaja","Jelgava","Ventspils"};
    return states;
}

else if(countryName.equals("Estonia")){
    String[] states={"Tallinn","Tartu","Narva","Parnu","Kohtla-Jarve"};
    return states;
}

else if(countryName.equals("Luxembourg")){
    String[] states={"Luxembourg City","Esch-sur-Alzette","Differdange","Dudelange","Ettelbruck"};
    return states;
}

else if(countryName.equals("Malta")){
    String[] states={"Valletta","Birkirkara","Mosta","Qormi","Sliema"};
    return states;
}

else if(countryName.equals("Cyprus")){
    String[] states={"Nicosia","Limassol","Larnaca","Paphos","Famagusta"};
    return states;
}

else if(countryName.equals("Greece")){
    String[] states={"Athens","Thessaloniki","Patras","Heraklion","Larissa"};
    return states;
}

else if(countryName.equals("Georgia")){
    String[] states={"Tbilisi","Batumi","Kutaisi","Rustavi","Zugdidi"};
    return states;
}

else if(countryName.equals("Armenia")){
    String[] states={"Yerevan","Gyumri","Vanadzor","Vagharshapat","Hrazdan"};
    return states;
}

else if(countryName.equals("Azerbaijan")){
    String[] states={"Baku","Ganja","Sumqayit","Mingachevir","Shaki"};
    return states;
}

else if(countryName.equals("Sri Lanka")){
    String[] states={"Western","Central","Southern","Northern","Eastern"};
    return states;
}

else if(countryName.equals("Maldives")){
    String[] states={"Male","Addu","Fuvahmulah","Kulhudhuffushi","Thinadhoo"};
    return states;
}

else if(countryName.equals("Bhutan")){
    String[] states={"Thimphu","Paro","Punakha","Wangdue","Bumthang"};
    return states;
}

else if(countryName.equals("Cambodia")){
    String[] states={"Phnom Penh","Siem Reap","Battambang","Kampot","Takeo"};
    return states;
}

else if(countryName.equals("Brunei")){
    String[] states={"Bandar Seri Begawan","Kuala Belait","Seria","Tutong","Bangar"};
    return states;
}

else if(countryName.equals("Timor-Leste")){
    String[] states={"Dili","Baucau","Maliana","Suai","Liquica"};
    return states;
}

else if(countryName.equals("Papua New Guinea")){
    String[] states={"Port Moresby","Lae","Mount Hagen","Madang","Goroka"};
    return states;
}

else if(countryName.equals("Fiji")){
    String[] states={"Suva","Nadi","Lautoka","Labasa","Ba"};
    return states;
}

else if(countryName.equals("Solomon Islands")){
    String[] states={"Honiara","Auki","Gizo","Buala","Kirakira"};
    return states;
}

else if(countryName.equals("Samoa")){
    String[] states={"Apia","Salelologa","Faleula","Safotu","Mulifanua"};
    return states;
}

else if(countryName.equals("Tonga")){
    String[] states={"Nuku'alofa","Neiafu","Haveluloto","Vaini","Pangai"};
    return states;
}

else if(countryName.equals("Vanuatu")){
    String[] states={"Port Vila","Luganville","Norsup","Isangel","Lakatoro"};
    return states;
}

else if(countryName.equals("Micronesia")){
    String[] states={"Palikir","Weno","Kolonia","Tofol","Colonia"};
    return states;
}

else if(countryName.equals("Palau")){
    String[] states={"Ngerulmud","Koror","Airai","Melekeok","Peleliu"};
    return states;
}

else if(countryName.equals("Marshall Islands")){
    String[] states={"Majuro","Ebeye","Jaluit","Wotje","Ailinglaplap"};
    return states;
}

else if(countryName.equals("Kiribati")){
    String[] states={"Tarawa","Betio","Bikenibeu","Teaoraereke","Bairiki"};
    return states;
}

else if(countryName.equals("Nauru")){
    String[] states={"Yaren","Aiwo","Anetan","Anabar","Baiti"};
    return states;
}

else if(countryName.equals("Tuvalu")){
    String[] states={"Funafuti","Vaiaku","Savave","Tanrake","Asau"};
    return states;
}

else if(countryName.equals("Seychelles")){
    String[] states={"Victoria","Anse Boileau","Beau Vallon","Takamaka","Baie Lazare"};
    return states;
}

else if(countryName.equals("Mauritius")){
    String[] states={"Port Louis","Curepipe","Vacoas","Quatre Bornes","Mahebourg"};
    return states;
}

else if(countryName.equals("Madagascar")){
    String[] states={"Antananarivo","Toamasina","Fianarantsoa","Mahajanga","Toliara"};
    return states;
}

else if(countryName.equals("Zambia")){
    String[] states={"Lusaka","Ndola","Kitwe","Kabwe","Livingstone"};
    return states;
}

else if(countryName.equals("Zimbabwe")){
    String[] states={"Harare","Bulawayo","Mutare","Gweru","Masvingo"};
    return states;
}

else if(countryName.equals("Botswana")){
    String[] states={"Gaborone","Francistown","Maun","Serowe","Kanye"};
    return states;
}

else if(countryName.equals("Namibia")){
    String[] states={"Windhoek","Walvis Bay","Swakopmund","Oshakati","Rundu"};
    return states;
}

else if(countryName.equals("Lesotho")){
    String[] states={"Maseru","Teyateyaneng","Mafeteng","Hlotse","Mohale's Hoek"};
    return states;
}

else if(countryName.equals("Eswatini")){
    String[] states={"Mbabane","Manzini","Lobamba","Siteki","Piggs Peak"};
    return states;
}

else if(countryName.equals("Rwanda")){
    String[] states={"Kigali","Butare","Gisenyi","Ruhengeri","Byumba"};
    return states;
}

else if(countryName.equals("Burundi")){
    String[] states={"Gitega","Bujumbura","Ngozi","Ruyigi","Makamba"};
    return states;
}

else if(countryName.equals("Somalia")){
    String[] states={"Mogadishu","Hargeisa","Bosaso","Kismayo","Baidoa"};
    return states;
}

else if(countryName.equals("Sudan")){
    String[] states={"Khartoum","Omdurman","Port Sudan","Nyala","El Obeid"};
    return states;
}

else if(countryName.equals("South Sudan")){
    String[] states={"Juba","Wau","Malakal","Yambio","Bor"};
    return states;
}

else if(countryName.equals("Libya")){
    String[] states={"Tripoli","Benghazi","Misrata","Zawiya","Sabha"};
    return states;
}

else if(countryName.equals("Angola")){
    String[] states={"Luanda","Huambo","Lobito","Benguela","Lubango"};
    return states;
}

else if(countryName.equals("Cameroon")){
    String[] states={"Yaounde","Douala","Bamenda","Bafoussam","Garoua"};
    return states;
}

else if(countryName.equals("Senegal")){
    String[] states={"Dakar","Saint-Louis","Touba","Kaolack","Ziguinchor"};
    return states;
}

else if(countryName.equals("Ivory Coast")){
    String[] states={"Abidjan","Yamoussoukro","Bouake","Daloa","Korhogo"};
    return states;
}

else if(countryName.equals("Mali")){
    String[] states={"Bamako","Sikasso","Mopti","Kayes","Gao"};
    return states;
}

else if(countryName.equals("Niger")){
    String[] states={"Niamey","Zinder","Maradi","Agadez","Tahoua"};
    return states;
}

else if(countryName.equals("Chad")){
    String[] states={"N'Djamena","Moundou","Sarh","Abéché","Kelo"};
    return states;
}

else if(countryName.equals("Central African Republic")){
    String[] states={"Bangui","Bimbo","Berberati","Carnot","Bambari"};
    return states;
}

else if(countryName.equals("Democratic Republic of Congo")){
    String[] states={"Kinshasa","Lubumbashi","Goma","Kananga","Bukavu"};
    return states;
}

else if(countryName.equals("Republic of Congo")){
    String[] states={"Brazzaville","Pointe-Noire","Dolisie","Nkayi","Owando"};
    return states;
}

else if(countryName.equals("Gabon")){
    String[] states={"Libreville","Port-Gentil","Franceville","Oyem","Moanda"};
    return states;
}

else if(countryName.equals("Equatorial Guinea")){
    String[] states={"Malabo","Bata","Ebebiyin","Aconibe","Mongomo"};
    return states;
}

else if(countryName.equals("Guinea")){
    String[] states={"Conakry","Nzerekore","Kankan","Kindia","Labe"};
    return states;
}

else if(countryName.equals("Sierra Leone")){
    String[] states={"Freetown","Bo","Kenema","Makeni","Port Loko"};
    return states;
}

else if(countryName.equals("Liberia")){
    String[] states={"Monrovia","Gbarnga","Kakata","Buchanan","Zwedru"};
    return states;
}

        return null;
    }

    public static void displayStates(String[] states){
        if(states!=null){
            for(String state:states){
                System.out.println(state);
            }
        } else {
            System.out.println("Country not found");
        }
    }
}