-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 17 Kwi 2019, 23:07
-- Wersja serwera: 10.1.37-MariaDB
-- Wersja PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `zadanie`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `news`
--

CREATE TABLE `news` (
  `id` int(11) NOT NULL,
  `tytul` text COLLATE utf8_polish_ci NOT NULL,
  `data_publikacji` text COLLATE utf8_polish_ci NOT NULL,
  `tresc` text COLLATE utf8_polish_ci NOT NULL,
  `data_dodania` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `news`
--

INSERT INTO `news` (`id`, `tytul`, `data_publikacji`, `tresc`, `data_dodania`) VALUES
(21, '​Rekordowa liczba aut R5 na Rajdzie Świdnickim-Krause', 'Wed, 17 Apr 2019 20:04:00 +0200', '<p><a href=\"https://www.rmf24.pl/raporty/raport-rajdowe-mistrzostwa-polski/swidnicki/news-rekordowa-liczba-aut-r5-na-rajdzie-swidnickim-krause,nId,2942953\"><img src=\"https://i.iplsc.com/rekordowa-liczba-aut-r5-na-rajdzie-swidnickim-krause/00081MRUWTHYDXOK-C459.jpg\" alt=\"​Rekordowa liczba aut R5 na Rajdzie Świdnickim-Krause\" align=\"left\" /></a>70 załóg zgłosiło się do tegorocznego Rajdu Świdnickiego-Krause. To impreza, która rozpoczyna sezon Rajdowych Samochodowych Mistrzostw Polski. W Świdnicy zobaczymy aż 11 aut klasy R5. To rekord jeśli chodzi o mistrzostwa Polski. Zabraknie jednak kilku ważnych nazwisk.</p><br clear=\"all\" />', '2019-04-17'),
(22, 'Robert Lewandowski po Euro 2020 trafi za ocean?', 'Wed, 17 Apr 2019 19:53:27 +0200', '<p><a href=\"https://www.rmf24.pl/sport/news-robert-lewandowski-po-euro-2020-trafi-za-ocean,nId,2942947\"><img src=\"https://i.iplsc.com/robert-lewandowski-po-euro-2020-trafi-za-ocean/00081MRG1BILGKGM-C459.jpg\" alt=\"Robert Lewandowski po Euro 2020 trafi za ocean?\" align=\"left\" /></a>Taylor Twellman, dziennikarz ESPN, zasugerował, że Robert Lewandowski w przyszłości może trafić do MLS, a dokładnie Chicago Fire. Miałoby się to stać </p><br clear=\"all\" />', '2019-04-17'),
(23, 'Liga Mistrz&oacute;w: Po raz pierwszy od 10 lat dwie angielskie drużyny mogą zagrać w p&oacute;łfinale', 'Wed, 17 Apr 2019 13:47:26 +0200', '<p><a href=\"https://www.rmf24.pl/sport/news-liga-mistrzow-po-raz-pierwszy-od-10-lat-dwie-angielskie-druz,nId,2942768\"><img src=\"https://i.iplsc.com/liga-mistrzow-po-raz-pierwszy-od-10-lat-dwie-angielskie-druz/00081LXPMVI0DYNG-C459.jpg\" alt=\"Liga Mistrzów: Po raz pierwszy od 10 lat dwie angielskie drużyny mogą zagrać w półfinale\" align=\"left\" /></a>FC Barcelona i Ajax Amsterdam, dziś poznają swoich rywali w półfinale Ligi Mistrzów. Po raz drugi z rzędu, awansować do tej fazy rozgrywek może Liverpool, który pierwsze spotkanie z Porto wygrał 2:0. Krok bliżej półfinału jest też Tottenham, który pierwsze spotkanie na własnym stadionie wygrał z Manchesterem City 1:0.</p><br clear=\"all\" />', '2019-04-17'),
(24, 'Ajax Amsterdam i FC Barcelona pierwszymi p&oacute;łfinalistami Ligi Mistrz&oacute;w', 'Tue, 16 Apr 2019 23:46:00 +0200', '<p><a href=\"https://www.rmf24.pl/sport/news-ajax-amsterdam-i-fc-barcelona-pierwszymi-polfinalistami-ligi,nId,2941202\"><img src=\"https://i.iplsc.com/ajax-amsterdam-i-fc-barcelona-pierwszymi-polfinalistami-ligi/00081KK2SB5USGW6-C459.jpg\" alt=\"Ajax Amsterdam i FC Barcelona pierwszymi półfinalistami Ligi Mistrzów\" align=\"left\" /></a>FC Barcelona i Ajax Amsterdam to pierwsze drużyny, które awansowały do półfinału piłkarskiej Ligi Mistrzów. W rewanżowych meczach ćwierćfinałowych Katalończycy pokonali u siebie Manchester United 3:0, a Ajax wygrał w Turynie z Juventusem 2:1</p><br clear=\"all\" />', '2019-04-17'),
(25, 'Wielkie zmiany w Lechu Poznań. Odejdzie przynajmniej 10 zawodnik&oacute;w', 'Tue, 16 Apr 2019 20:01:11 +0200', '<p><a href=\"https://www.rmf24.pl/sport/news-wielkie-zmiany-w-lechu-poznan-odejdzie-przynajmniej-10-zawod,nId,2941154\"><img src=\"https://i.iplsc.com/wielkie-zmiany-w-lechu-poznan-odejdzie-przynajmniej-10-zawod/00081K9XDG7ORW67-C459.jpg\" alt=\"Wielkie zmiany w Lechu Poznań. Odejdzie przynajmniej 10 zawodników\" align=\"left\" /></a>Pomocnicy Łukasz Trałka, Maciej Gajos oraz bramkarze Jasmin Buric i Matus Putnocky to tylko niektórzy piłkarze, którzy po zakończeniu sezonu odejdą z Lecha Poznań. Klub we wtorek poinformował, że drużynę opuści aż 10 zawodników.</p><br clear=\"all\" />', '2019-04-17'),
(141, 'Registry Life 4.23', 'Wed, 17 Apr 2019 20:47:58 GMT', '\n            <p>Registry Life to darmowe i proste w obsłudze program do optymalizacji Windows. Za pomocą aplikacji uzyskamy możliwość skanowania oraz usuwania błędnych wpisów w rejestrze systemowym. Pozostawiane są one przez programy, a zbyt duża ich ilość niekorzystnie wpływa na stabilność oraz wydajność Windows. Registry Life...</p>\n            <a href=\"https://download.komputerswiat.pl/akcesoria-i-narzedzia/rejestr-windows/registry-life\">\n            <img src=\"https://download.komputerswiat.pl/thumbnails/dl200x150/src/media/2011/313/282333/registry-life.jpg.aspx\" />\n            </a>\n        ', '2019-04-17'),
(142, 'TeamSpeak 3 Client 3.2.5', 'Wed, 17 Apr 2019 20:47:01 GMT', '\n            <p>TeamSpeak Client to elastyczne i rozbudowane narzędzie umożliwiające komunikację głosową lub tekstową z każdą osobą za pośrednictwem internetu. Program rozwijany jest od 2002 roku i zdołał zyskać spore uznanie i popularność wśród internautów na całym świecie. Jedną z większych zalet aplikacji jest jej dostępność na...</p>\n            <a href=\"https://download.komputerswiat.pl/internet-i-sieci/komunikatory/teamspeak-client\">\n            <img src=\"https://download.komputerswiat.pl/thumbnails/dl200x150/src/media/2017/19/2762269/teamspeak_client_s.jpg.aspx\" />\n            </a>\n        ', '2019-04-17'),
(143, 'Asystent Magazyn 2019 19.4.16', 'Wed, 17 Apr 2019 20:36:50 GMT', '\n            <p>Asystent Magazyn 2019 to program przeznaczony do prowadzenia gospodarki magazynowej o podstawowej funkcjonalności. Jego możliwości to łatwe wyszukiwanie produktów, dodawanie opisów do produktów, tworzenie zestawów, dodawanie kategorii, przyjęcie PZ oraz wydanie z magazynu WZ. Asystent Magazyn pozwala na drukowanie...</p>\n            <a href=\"https://download.komputerswiat.pl/biuro-i-praca/obsluga-magazynu/asystent-magazyn\">\n            <img src=\"https://download.komputerswiat.pl/thumbnails/dl200x150/src/media/2017/59/2983326/asystent-magazyn-s.jpg.aspx\" />\n            </a>\n        ', '2019-04-17'),
(144, 'Asystent Wyciągi Bankowe 2019 19.4.16', 'Wed, 17 Apr 2019 20:35:21 GMT', '\n            <p>Asystent Wyciągi Bankowe to narzędzie finansowe, które przyda się zarówno osobom indywidualnym oraz firmom posiadających wiele kont bankowych. Aplikacja pozwala przetwarzać wyciągi bankowe z plików CSV. Asystent Wyciągi Bankowe błyskawiczne przeszuka zgromadzone dane np. po nazwie wpłacającego, numerze konta oraz...</p>\n            <a href=\"https://download.komputerswiat.pl/biuro-i-praca/ksiegowosc/asystent-wyciagi-bankowe\">\n            <img src=\"https://download.komputerswiat.pl/thumbnails/dl200x150/src/media/2013/204/768925/asystent-wyciagi-bankowe.jpg.aspx\" />\n            </a>\n        ', '2019-04-17'),
(145, 'Asystent Dokumenty Kasowe 2019 19.4.16', 'Wed, 17 Apr 2019 20:35:05 GMT', '\n            <p>Asystent Dokumenty Kasowe to łatwe w obsłudze narzędzie do wystawiania dokumentów kasowych KP i KW oraz tworzenia raportów kasowych. Aplikacja pozwala przechowywać w swojej bazie dokumenty kasowe dla wielu podmiotów gospodarczych. Asystent Dokumenty Kasowe oferuje również możliwość przeszukiwania dokumentów po...</p>\n            <a href=\"https://download.komputerswiat.pl/biuro-i-praca/ksiegowosc/asystent-dokumenty-kasowe\">\n            <img src=\"https://download.komputerswiat.pl/thumbnails/dl200x150/src/media/2013/247/801603/asystent-dokumenty-kasowe.jpg.aspx\" />\n            </a>\n        ', '2019-04-17');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `url_done`
--

CREATE TABLE `url_done` (
  `id` int(11) NOT NULL,
  `url` text COLLATE utf8_polish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `url_done`
--

INSERT INTO `url_done` (`id`, `url`) VALUES
(9, 'https://www.rmf24.pl/sport/feed'),
(33, 'https://download.komputerswiat.pl/rss-feeds/news-feed');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `news`
--
ALTER TABLE `news`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `url_done`
--
ALTER TABLE `url_done`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `news`
--
ALTER TABLE `news`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=146;

--
-- AUTO_INCREMENT dla tabeli `url_done`
--
ALTER TABLE `url_done`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
