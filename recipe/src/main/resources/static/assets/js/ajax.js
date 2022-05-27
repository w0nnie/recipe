function getProductAx(path, resultFrag, name){
    $.ajax({
        url:"/recipe/search",
        data: {"path" : path, "name" : name, "resultFrag" : resultFrag},
        type:"POST",
        cache: false
    }).done(function (fragment){
        $("#" + resultFrag).replaceWith(fragment);
    });
}

function getTypeWayKcalAx(path, resultFrag,kcal,type,way){
    $.ajax({
        url:"/recipe/search2",
        data: {"path" : path, "resultFrag" : resultFrag, "kcal" : kcal, "type" : type, "way" : way},
        type:"POST",
        cache: false
    }).done(function (fragment){
        $("#" + resultFrag).replaceWith(fragment);
    });
}