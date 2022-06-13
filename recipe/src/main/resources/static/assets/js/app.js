const kcal = document.getElementById("jsRange");
const way = document.getElementById("way");
const type = document.getElementById("type");
const ingredient = document.getElementsByName("ingredient");

function getProduct() {
  var path = "pages/main";
  var resultFrag = "getProductAxDiv";
  const name = document.getElementById("name").value;
  getProductAx(path, resultFrag, name);
}

function getRangeChange() {
  var path = "pages/main";
  var resultFrag = "getProductAxDiv";
  const kvalue = kcal.value;
  const kvalueInt = parseFloat(kvalue);
  const wvalue = way.value;
  const tvalue = type.value;
  getTypeWayKcalAx(path, resultFrag, wvalue, tvalue, kvalueInt);
}

function getIngredient(event){
  var path ="pages/ingredient";
  var resultFrag = "getIngredientAxDiv";
  console.log("여기"+event);
  getIngredientAx(path, resultFrag, event);

}

function getCheckboxValue(event) {
  var ingredient_length = document.getElementsByName("ingredient").length;
  if(event.checked == true){ // 체크시
    for(var i = 0; i<ingredient_length; i++){
      if(document.getElementsByName("ingredient")[i].checked == true)
        if(ingredient[i] != null)
          console.log(ingredient[i].value);
          getIngredient(ingredient[i].value);
    }
  }else{ //체크해제시 
    for(var i = 0; i<ingredient_length; i++){
      if(document.getElementsByName("ingredient")[i].checked == true)
        if(ingredient[i] != null)
          console.log(ingredient[i].value);
    }
  }
}

// $('#check').click(function(){
//     var checked = $('#check').is(':checked');

//     if(checked){
//         console.log($('#check').val());
//     }else{
//         console.log(" ");
//     }
// })
