<?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "creditcard";

    $conn = new mysqli($servername, $username, $password, $dbname);  //make a connection
    mysqli_select_db($conn, 'creditcard');
        // Check connection
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    exit();
    } 
    $query = "SELECT * FROM `card` ORDER BY `#` ASC";   // a query to select a table
    $result = mysqli_query($conn, $query);
    $row = mysqli_fetch_array($result);   //fetch a result row as an associative array
    $total = mysqli_num_rows($result); //count how many rows there are 
    $x = $total + 1;  //$x = number of rows + 1
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // collect value of input field
        $cardNum = $_POST['cardNumber'];  //take input from first field, called 'cardNumber'
        $date = $_POST['date']; //take input fro second field, called 'date'
        $secCode = $_POST['code']; //take input from third field, called 'code'
        strval($cardNum);   //make $cardNum string
        $twelveNum = substr($cardNum, 0, -4);   // set in $twelveNum first 12 numbers from $cardNum
        $fourNum = substr($cardNum, -4, 4);   //set in $fourNum last 4 numbers from $cardNum
        strval($fourNum); 
        $cardNum = crypt($twelveNum, '_J9..rasm');  //encrypt $twelveNum and set it in $cardNum
        $cardNum .= $fourNum;  //add to $cardNum last 4 numbers
        if (empty($cardNum)|| empty($date) || empty($secCode)   ) {  //if any field is empty
            echo "Card number is empty";   //display message
        } else {  //if not
            $sql = "INSERT INTO `card` (`#`, `ccnum`, `expdate`, `seccode`) VALUES ('$x', '$cardNum', '$date', '$secCode')"; //add to database values from fields
            if ($conn->query($sql) === TRUE) { //if adding is successful
                unset($cardNum);  //delete value form $cardNum  
                unset($date);      //delete value form $date
                unset($secCode);     //delete value form $secCode
            } else {
        echo "Error: " . $sql . "<br>" . $conn->error;  //display error
        }
    } 
} 
    $query1 = "SELECT * FROM `card` ORDER BY `#` DESC LIMIT 1"; //take the last added row
    $result1 = mysqli_query($conn, $query1);
    $row1 = $result1->fetch_array(); //set it in $row1
    $card = $row1['ccnum']; //set in $card a card number from last row
    $displayedCard ='';
    for($i = 0; $i <= 12; $i++){ // 12 times
        $displayedCard .= '*'; //set in $displayedCard 12 '*'
    }
    $displayedCard .= substr($card, -4, 4);  //add to $displayedCard the last 4 numbers from card number
    $conn->close();
?>
<!DOCTYPE html>
<html lang = "en">
  <html>
    <head>
      <meta charset="utf-8">
      <link rel="stylesheet" href="mystyle.css">
    </head>
    <body>
      <header>
        <h1>You have successfully entred your credit card details
        </h1>
      </header> 
      <h3>Debit/Credit Card
        </h3>
      <img src = "img/mastercard.svg" class='myImage'>
      <br>
      <h4>Your credit card number ends in
        <?php echo "  ".$displayedCard ?>
      </h4>
      <script src="js/numberCheck.js">
      </script>
    </body>
  </html>

