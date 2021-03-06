# SecretVault-sovellus

Sovelluksessa pystyy kirjoittamaan merkintöjä, joita vain tietty käyttäjä pystyy näkemään. Käyttäjä kirjautuu omalla pääsykoodillaan. Sovelluksen alkunäkymässä on toimiva laskin, johon pääsykoodi syötetään. Kun koodi on syötetty, painetaan %-näppäintä ja käyttäjän omat merkinnät avautuvat.

## Suoritusohjeet

Ohjelma tulee suorittaa Main-luokasta. Tällä hetkellä ohjelman suorituksessa avautuu graafinen ikkuna, mutta mitään toiminnallisuutta ei ole vielä saatavilla.

Komentorivillä pystyy suorittamaan seuraavat toiminnot:

- mvn compile exec:java -Dexec.mainClass=secretvault.ui.Main (suorittaa koodin)
- mvn test jacoco:report (tekee testiraportin)
- mvn package (generoi jar-tiedoston)
- mvn jxr:jxr checkstyle:checkstyle (suorittaa Checkstylen)

## Dokumentaatio

[Vaatimusmäärittely](https://github.com/marinarogulina/ot-harjoitustyo/blob/master/dokumentaatio/vaatimusmaarittely.md)

[Työaikakirjanpito](https://github.com/marinarogulina/ot-harjoitustyo/blob/master/dokumentaatio/tuntikirjanpito.md)

[Arkkitehtuurikuvaus](https://github.com/marinarogulina/ot-harjoitustyo/blob/master/dokumentaatio/arkkitehtuuri.md)

[Ensimmäinen release](https://github.com/marinarogulina/ot-harjoitustyo/releases/tag/viikko5)
