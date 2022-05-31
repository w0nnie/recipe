const kcal = document.getElementById("jsRange");
const way = document.getElementById("way");
const type = document.getElementById("type");

function getProduct(){
    var path = "pages/main";
    var resultFrag = 'getProductAxDiv';
    const name = document.getElementById("name").value;
    getProductAx(path, resultFrag, name);
}

function rangeChange(){
     var path = "pages/main";
     var resultFrag = 'getProductAxDiv';
     const kvalue =  kcal.value;
     const kvalueInt = parseFloat(kvalue);
     const wvalue = way.value;
     const tvalue = type.value;
    getTypeWayKcalAx(path, resultFrag,wvalue,tvalue,kvalueInt);
}
