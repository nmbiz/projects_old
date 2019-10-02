<?php
require("functions.php")
 ?>
<!doctype HTML>
<html>
<head>
  <title>Main</title>
  <utf charset="UTF-8">
</head>
<body>
  <form method='POST' action=''>
    <input type="text" name='url' placeholder='Tutaj wklej link RSS' required>
    <input type='submit'>
    <!--formularz pobierający od użytkownika link-->
  </form>
</body>
</html>
<?php
  if(isset($_POST['url'])){
    $url=$_POST['url'];
    writer_main($url);
    unset($url);
  }

 ?>
