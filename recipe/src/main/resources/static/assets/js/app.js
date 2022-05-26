const kcal = document.getElementById("jsRange");
const way = document.getElementById("way");
const type = document.getElementById("type");


function rangeChange(){
    console.log(kcal.value);
    console.log(way.value);
    console.log(type.value);
}

function getProduct(){
    var path = "pages/main";
    var resultFrag = 'getProductAxDiv';
    const name = document.getElementById("name").value;
    console.log(name);
    getproductAX(path, resultFrag, name);
    // if (way == ""){
    //     getproductAX(path,name,type,kcal);
    // }else if(type == ""){
    //     getproductAX(path,name,way,kcal);
    // }else if(way == "" && type== ""){
    //     getproductAX(path,kcal);
    // }else{
    //     getproductAX(path,name,way,type,kcal);
    // }
}

kcal.addEventListener("change",rangeChange);
