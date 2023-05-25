import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main {

    public static void main(String[] args) throws IOException {
        File file = new File("/media/mohamed/BEDF-D9B1/AmigosCode - Database Design & Implementation/AmigosCode - Database Design & Implementation  [Hacksnation.com]/Database Design & Implementation.txt");
//       File [] files=file.listFiles();
//       for (File file1:files){
//           System.out.println(file1.getName());
//       }
        BufferedReader br= new BufferedReader(new FileReader(file));

        String st;
        int i=1;
        while ((st = br.readLine()) != null)
        {
            Path source = Paths.get("/media/mohamed/BEDF-D9B1/AmigosCode - Database Design & Implementation/AmigosCode - Database Design & Implementation  [Hacksnation.com]/lesson"+i+".mp4");
            Files.move(source, source.resolveSibling(i+"- "+st +".mp4"));
            System.out.println(st);
            i++;
        }

//        String s =  "{\"id_client\":\"1\",\"cni\":{\"nom_arabe\":\"Ø¨ÙØ¨ÙØ±\",\"prenom_arabe\":\"Ø­Ø§Ø¬Ø©\",\"numero_cni\":\"207844544\",\"numero_identif_national\":\"119620468001220000\",\"date_delivrance\":\"08/05/2022\",\"date_expiration\":\"07/05/2032\",\"date_naissance\":\"21/02/1962\",\"autorite_delivrance\":\"ØªÙØ§Ø±Øª ÙØ±ÙØ¯Ø© Ø¨ÙØ¯ÙØ©\",\"autorite_delivrance_latin\":\"Tiaret\",\"place_naissance\":\"ÙØ±ÙØ¯Ø©\",\"place_naissance_latin\":\"Frenda\",\"genre\":\"Femme\",\"cni_inf_10_ans\":true,\"logiciel_utiliser\":\" Canon\",\"document_modifie\":false},\"cni_verso\":{\"nom_latin\":\"BOUBEKEUR\",\"prenom_latin\":\"HADJA\",\"logiciel_utiliser\":\" Canon\",\"document_modifie\":false},\"extrait_naissance\":{\"pere\":\" Ø¨ÙØ¨ÙØ± Ø¹Ø¨Ø¯ Ø§ÙÙØ§Ø¯Ø± \",\"mere\":\"Ø¨ÙØ¨ÙØ± Ø²ÙØ±Ø© \",\"numero\":\"00122\",\"date_naissance\":\"21/02/1962\",\"date_delivrance\":\"27/03/2022\",\"acte_valid\":true,\"age_inf_70ans\":true,\"logiciel_utiliser\":\" Canon\",\"document_modifie\":false,\"date_mariage\":\"03/09/1996\"},\"residence\":{\"date_delivrance\":\"27/03/2022\",\"adresse\":{\"wilaya\":\" ØªÙØ§Ø±Øª\",\"daira\":\" ÙØ±ÙØ¯Ø©\",\"commune\":\" ÙØ±ÙØ¯Ø©\",\"rue\":\"Ø­Ù Ø§ÙØ¹ÙØ§ØµØ± ÙØ±ÙØ¯Ø©\"},\"fiche\":true,\"fiche_inf_6mois\":false,\"logiciel_utiliser\":\" Canon\",\"document_modifie\":false},\"fiche_familiale\":{\"nombre_enfants\":0,\"date_mariage\":\"1996-09-03\",\"date_delivrance\":\"2022-05-29\",\"fiche_inf_1mois\":true,\"logiciel_utiliser\":\" Canon\",\"document_modifie\":false},\"fiche_de_paie_1\":{\"salaire\":56374,\"verify_calcul\":false,\"salaire_superieur_a_25000\":true,\"verify_delivrance\":false,\"logiciel_utiliser\":\" Canon SC1011\",\"document_modifie\":false},\"fiche_de_paie_2\":{\"salaire\":56374,\"verify_calcul\":false,\"salaire_superieur_a_25000\":true,\"verify_delivrance\":false,\"logiciel_utiliser\":\" Canon SC1011\",\"document_modifie\":false},\"fiche_de_paie_3\":{\"salaire\":56374,\"verify_calcul\":false,\"salaire_superieur_a_25000\":true,\"verify_delivrance\":false,\"logiciel_utiliser\":\" Canon SC1011\",\"document_modifie\":false},\"retraite\":{\"erreur\":\"Fichier introuvable\"},\"ccp\":{\"effectue_de\":\"2021-11-01\",\"effectue_au\":\"2022-04-14\",\"duree_transaction_par_mois\":5,\"duree_sup_3_mois_delivrance_min_1_mois\":false,\"last_avoir\":62,\"verify_calcul\":false,\"logiciel_utiliser\":\" Canon\",\"document_modifie\":false},\"cheque\":{\"rib\":\"00799999002045620014\",\"num_compte\":\"0020456200\",\"cle\":\"14\",\"logiciel_utiliser\":\" Canon\",\"document_modifie\":false},\"carte_chifa\":{\"numero_ss\":\"62 0122 0403 71\",\"numero_acte\":\"0122\",\"logiciel_utiliser\":\" Canon\",\"document_modifie\":false},\"attestation\":{\"date_delivrance\":\"13/06/2022\",\"date_naissance\":\"13/11/1982\",\"nombre_annees_travaille\":16,\"date_de_travaille\":\"08/10/2005\",\"Attestation_sup_1mois\":false,\"superieur_a_un_an\":true,\"logiciel_utiliser\":\" Canon SC1011\",\"document_modifie\":false},\"verification\":{\"extrait_naissance\":true,\"extrait_naissance_nom_fr\":true,\"extrait_naissance_lieu_naissance\":true,\"fiche_familiale\":true,\"marier\":true,\"divorce\":false,\"residence\":true,\"chifa\":true,\"cheque\":true,\"fiche_paie_1\":false,\"fiche_paie_2\":false,\"fiche_paie_3\":false,\"retraite\":false,\"ccp\":true,\"attestation_de_travail\":false,\"check_list\":{\"carte-national-biometrique\":{\"cni_lisible\":true,\"cni_en_cour_validite\":true},\"extrait_naissance\":{\"ext_nom_prenom_en_franÃ§ais\":true,\"ext_encour_de_validite_inf_1an\":true,\"numero_extrait_naissnace\":true,\"ext_lieu_naissance\":true,\"client_age_inf_70\":true},\"residence\":{\"residenc_en_validite\":false,\"residence_appartient_client\":true},\"attestation_travaille\":{\"att_travaille_appartient_au_client\":false,\"doucument_en_validite\":false,\"client_travaille_sup_1ans\":true},\"fiche_paie1\":{\"fiche-paie_etabli_depuis_un_moi\":false,\"fiche_paie_verifie_salaire_sup_25000\":true,\"salaire_conforme_indiquÃ©_sur_releve\":false},\"fiche_paie2\":{\"fiche-paie_etabli_depuis_un_moi\":false,\"fiche_paie_verifie_salaire_sup_25000\":true,\"salaire_conforme_indiquÃ©_sur_releve\":false},\"fiche_paie3\":{\"fiche-paie_etabli_depuis_un_moi\":false,\"fiche_paie_verifie_salaire_sup_25000\":true,\"salaire_conforme_indiquÃ©_sur_releve\":false},\"releve_de_compte\":{\"releve_porte_plus_3moi\":true,\"releve_de_validite_inf_1mois\":false,\"Verifier_concordance_entre_montants_credites_et_montants_debites\":false,\"Verifier_date_etablissement_releve_compte\":\"01/11/2021\",\"Verifier_regularite_salaires\":false}}}}";
////        System.out.println(s.replaceAll("/",""));
//
//        String ss ="{\n" +
//                "    \"id_client\": \"3\",\n" +
//                "    \"cni\": {\n" +
//                "        \"erreur\": \"Document illisible\"\n" +
//                "    },\n" +
//                "    \"cni_verso\": {\n" +
//                "        \"nom_latin\": \"BENARBIA\",\n" +
//                "        \"prenom_latin\": \"; ZAHRA\",\n" +
//                "        \"logiciel_utiliser\": \" Canon SC1011\",\n" +
//                "        \"document_modifie\": false\n" +
//                "    },\n" +
//                "    \"extrait_naissance\": {\n" +
//                "        \"pere\": \" عبد القادر \",\n" +
//                "        \"mere\": \"غليمة بو عزة معروف\",\n" +
//                "        \"numero\": \"02764\",\n" +
//                "        \"date_naissance\": \"13/11/1982\",\n" +
//                "        \"date_delivrance\": \"28/04/2022\",\n" +
//                "        \"acte_valid\": true,\n" +
//                "        \"age_inf_70ans\": true,\n" +
//                "        \"logiciel_utiliser\": \" Canon SC1011\",\n" +
//                "        \"document_modifie\": false\n" +
//                "    },\n" +
//                "    \"residence\": {\n" +
//                "        \"date_delivrance\": \"28/04/2022\",\n" +
//                "        \"adresse\": {\n" +
//                "            \"wilaya\": \" عين تموشنت\",\n" +
//                "            \"daira\": \" عين تموشنت\",\n" +
//                "            \"commune\": \" عين تموشنت\",\n" +
//                "            \"rue\": \" رقم 49 حي 150 مسكن CNEP عين تموشنت ب 1 79 2\"\n" +
//                "        },\n" +
//                "        \"fiche\": true,\n" +
//                "        \"fiche_inf_6mois\": false,\n" +
//                "        \"logiciel_utiliser\": \" Canon SC1011\",\n" +
//                "        \"document_modifie\": false\n" +
//                "    },\n" +
//                "    \"fiche_familiale\": {\n" +
//                "        \"erreur\": \"Document illisible\"\n" +
//                "    },\n" +
//                "    \"fiche_de_paie_1\": {\n" +
//                "        \"salaire\": 56374,\n" +
//                "        \"verify_calcul\": false,\n" +
//                "        \"salaire_superieur_a_25000\": true,\n" +
//                "        \"verify_delivrance\": false,\n" +
//                "        \"logiciel_utiliser\": \" Canon SC1011\",\n" +
//                "        \"document_modifie\": false\n" +
//                "    },\n" +
//                "    \"fiche_de_paie_2\": {\n" +
//                "        \"erreur\": \"Fichier introuvable\"\n" +
//                "    },\n" +
//                "    \"fiche_de_paie_3\": {\n" +
//                "        \"erreur\": \"Fichier introuvable\"\n" +
//                "    },\n" +
//                "    \"retraite\": {\n" +
//                "        \"erreur\": \"Fichier introuvable\"\n" +
//                "    },\n" +
//                "    \"ccp\": {\n" +
//                "        \"effectue_de\": \"2021-12-01\",\n" +
//                "        \"effectue_au\": \"2022-06-04\",\n" +
//                "        \"duree_transaction_par_mois\": 6,\n" +
//                "        \"duree_sup_3_mois_delivrance_min_1_mois\": false,\n" +
//                "        \"last_avoir\": 8031,\n" +
//                "        \"verify_calcul\": false,\n" +
//                "        \"logiciel_utiliser\": \" 2022\",\n" +
//                "        \"document_modifie\": false\n" +
//                "    },\n" +
//                "    \"cheque\": {\n" +
//                "        \"rib\": \"00799999000070253814\",\n" +
//                "        \"num_compte\": \"0000702538\",\n" +
//                "        \"cle\": \"14\",\n" +
//                "        \"logiciel_utiliser\": \" Canon SC1011\",\n" +
//                "        \"document_modifie\": false\n" +
//                "    },\n" +
//                "    \"carte_chifa\": {\n" +
//                "        \"erreur\": \"Fichier introuvable\"\n" +
//                "    },\n" +
//                "    \"attestation\": {\n" +
//                "        \"date_delivrance\": \"13/06/2022\",\n" +
//                "        \"date_naissance\": \"13/11/1982\",\n" +
//                "        \"nombre_annees_travaille\": 16,\n" +
//                "        \"date_de_travaille\": \"08/10/2005\",\n" +
//                "        \"Attestation_sup_1mois\": false,\n" +
//                "        \"superieur_a_un_an\": true,\n" +
//                "        \"logiciel_utiliser\": \" Canon SC1011\",\n" +
//                "        \"document_modifie\": false\n" +
//                "    },\n" +
//                "    \"rena\": {\n" +
//                "        \"erreur\": \"Fichier introuvable\"\n" +
//                "    },\n" +
//                "    \"radiation\": {\n" +
//                "        \"erreur\": \"Fichier introuvable\"\n" +
//                "    },\n" +
//                "    \"verification\": {\n" +
//                "        \"extrait_naissance\": false,\n" +
//                "        \"extrait_naissance_nom_fr\": false,\n" +
//                "        \"extrait_naissance_lieu_naissance\": false,\n" +
//                "        \"fiche_familiale\": false,\n" +
//                "        \"marier\": false,\n" +
//                "        \"divorce\": false,\n" +
//                "        \"residence\": false,\n" +
//                "        \"chifa\": false,\n" +
//                "        \"cheque\": false,\n" +
//                "        \"fiche_paie_1\": false,\n" +
//                "        \"fiche_paie_2\": false,\n" +
//                "        \"fiche_paie_3\": false,\n" +
//                "        \"retraite\": false,\n" +
//                "        \"ccp\": false,\n" +
//                "        \"attestation_de_travail\": false,\n" +
//                "        \"rena\": null,\n" +
//                "        \"radiation\": null,\n" +
//                "        \"check_list\": {}\n" +
//                "    }\n" +
//                "}";
//
//        Integer  a=1;
//        System.out.println(ss.length());
//        System.out.println( s.equals(a));

    }


}
