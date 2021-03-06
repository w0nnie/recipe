const kcal = document.getElementById("jsRange");
const way = document.getElementById("way");
const type = document.getElementById("type");
const ingredient = document.getElementsByName("ingredient");


function getCheckId(){
  const id = document.getElementById("id").value;
  getCheckIdAx(id);
}

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

function getIngredient(event){ // ingredient.value가 들어온다.
  var path ="pages/ingredient";
  var resultFrag = "getIngredientAxDiv";
  getIngredientAx(path, resultFrag, event);
}

function getCheckboxValue(event) { //input태그 전체가 들어온다.
  var ingredient_length = document.getElementsByName("ingredient").length;
  var chkCnt = 0; 
  let ingredients = [];
  if(event.checked == true){ // 체크시
    for(var i = 0; i<ingredient_length; i++){
      if(document.getElementsByName("ingredient")[i].checked == true){
        ingredients.push(ingredient[i].value);
        chkCnt++;
      }
    }
    if(chkCnt > 4){ //checkbox 갯수제한
      event.checked = false;
      return false;
    }else{
      getIngredient(ingredients);
    }
  }else{ //체크해제시 
    for(var i = 0; i<ingredient_length; i++){
      if(document.getElementsByName("ingredient")[i].checked == true){
        ingredients.push(ingredient[i].value);
      }
    }
    getIngredient(ingredients);
  }
}

// function countCheck(obj){ //checkbox 갯수제한
//   var chkBox = document.getElementsByName("ingredient");
//   var chkCnt = 0;
//   for(var i =  0; i < chkBox.length; i++){
//     if(chkBox[i].checked){
//       chkCnt++;
//     }
//   }
//   if(chkCnt > 4){
//     obj.checked = false;
//     return false;
//   }
// }

// $('#check').click(function(){
//     var checked = $('#check').is(':checked');

//     if(checked){
//         console.log($('#check').val());
//     }else{
//         console.log(" ");
//     }
// })
