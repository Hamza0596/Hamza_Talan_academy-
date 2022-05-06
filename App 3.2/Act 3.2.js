

function checkmail() {
  let check = document.querySelector('#mail').value ;
    if(check.length==''){
      document.querySelector('#message').innerHTML="Email vide !!!!"
      document.querySelector('#message').style.backgroundColor = "red"

    }
    else{
      alert("c bien");
    }

  }

 