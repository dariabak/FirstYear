function cardnumber(inputtxt) {
    var date = new Date(document.getElementById('date').value);
    var cardno = /^(?:5[1-5][0-9]{14})$/;
    var secCode = document.getElementById('code');
    var today = new Date();
    var size = secCode.value.length;
    
    if(isNaN(secCode.value)){
        alert("Wrong security code!");  
        return false;
    }

    if(date < today){
        alert("Incorrect date!");
        return false;
    }

    if (!inputtxt.value.match(cardno)) {
        alert("Not a valid Mastercard number!");
        return false;
    }
    if(size == 3 || size == 4){
        return true;
    } else{
        alert("Wrong security code length");
        return false
    }
    
}
