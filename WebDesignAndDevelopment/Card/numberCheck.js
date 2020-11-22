function cardnumber(inputtxt) {
    var date = new Date(document.getElementById('date').value); //create a new date, which is equal to entered date
    var cardno = /^(?:5[1-5][0-9]{14})$/;
    var secCode = document.getElementById('code');  //get a security code input
    var today = new Date();  //create today's date
    var size = secCode.value.length;  //create a size, which is equal to security code length

    if (isNaN(secCode.value)) {  //if secCode is not a number, then return fals and alert
        alert("Wrong security code!");
        return false;
    }

    if (date < today) {  //if entered date is in the past, then return false and alert
        alert("Incorrect date!");
        return false;
    }

    if (!inputtxt.value.match(cardno)) { //if entered card number match to cardno(it checks if it is a mastercard card)
        alert("Not a valid Mastercard number!");
        return false;
    }

    if (size == 3 || size == 4) { //if size(secCode length) is equal 3 or 4, then return true

        return true;
    } else {   //if not, display alert and return false
        alert("Wrong security code length");
        return false
    }

}
