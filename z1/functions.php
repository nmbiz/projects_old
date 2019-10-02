<?php
require_once("definer.php");
function check($url){
  //funkcja sprawdzająca czy dany link nie został już wykorzystany
  $con=mysqli_connect("localhost",selecter,selecter_password,"zadanie");
  //podłączenie do bazy danych
  if(!$con){
    print("Błąd łączenia z bazą danych:".mysqli_connect_error());
    exit;
    //sprawdzenie czy udało sie podłączyć
  }
  $query="SELECT url FROM `url_done`";
  $result=mysqli_query($con,$query);
  //pobranie adresow url z tablicy bazy danych
  unset($query);
  $row=$result->fetch_array();
  if($row!=null){
    //sprawdzenie czy tablica nie jest pusta
 foreach($row as $row){
   if($row==$url)   return true;
   //porownanie linku podanego przez uzytkownika z tymi z bazy danych
    }
  }
  return false;
  unset($row);
  mysqli_close($con);
  //rozłączenie z bazą danych
}
function writer($url){
  if(@simplexml_load_file($url)){
    $xml=simplexml_load_file($url);
    //sprawdzanie czy link nie jest błędny
  }
  else{
    echo "Błędny link";
    exit;
  }
  $con=mysqli_connect("localhost",inserter,inserter_password,"zadanie");
  //podłączenie do bazy danych
  if(!$con){
    print("Błąd łączenia z bazą danych:".mysqli_connect_error());
    exit;
    //sprawdzenie czy udało sie podłączyć
  }
  mysqli_set_charset($con,"utf8");
  //zmienia zestaw znakow bazy danych na polskie
  $title;
  $date;
  $desc;
  for($x=0;$x<5;$x++){
    $title=htmlentities($xml->channel->item[$x]->title);
    $date=htmlentities($xml->channel->item[$x]->pubDate);
    $desc=$xml->channel->item[$x]->description;
    $query="INSERT INTO news ( tytul, data_publikacji,tresc,data_dodania ) VALUES ( '".$title."', '".$date."','".$desc."',NOW() );";
    mysqli_query($con,$query);
    logs("mid");
  }

  //zapisywanie do bazy danych
  $query="INSERT INTO url_done ( url ) VALUES ( '".$url."' );";
  mysqli_query($con,$query);
  unset($query);
  unset($xml);
  unset($title);
  unset($desc);
  unset($date);
  mysqli_close($con);

}
function writer_main($url){
  logs("start");
  //głowna funkcja sprawdzająca warunki i uruchamiająca podfunkcje zapisujące do bazy danych
  if(check($url)==false){
    writer($url);
  }
  else{
    print("Link został już wykorzystany");
  }
  logs("end");
}
function logs($type){
  $txt="";
  $file = fopen("log.txt", "r+") or die("Unable to open log file!");
  while(!feof($file)) {
  $txt=$txt."".fgets($file);
  }
  //otwiera plik zawierający logi
  switch ($type) {
  //sprawdza jaka czynność została zrobiona
  case 'start':
    $txt=$txt."Rozpoczęcie wykonywania-";
    break;
    case 'end':
    $txt=$txt."Zakończenie wykonywania-";
    break;
    case 'mid':
    $txt=$txt."Dodanie artykułu-";
    break;
  }
  fwrite($file,$txt."".date("Y-m-d H:i:s")."\n");
  //zapisuje do pliku z aktualną datą i czasem
  fclose($file);
  //zamyka plik
}
?>
