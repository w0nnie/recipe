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

function getTypeWayKcalAx(path, resultFrag, wvalue, tvalue, kvalueInt){
    $.ajax({
        url:"/recipe/search2",
        data: {"path" : path, "resultFrag" : resultFrag, "type" : tvalue, "way" : wvalue, "kcal" : kvalueInt},
        type:"POST",
        cache: false
    }).done(function (fragment){
        $("#" + resultFrag).replaceWith(fragment);
    });
}

function getIngredientAx(path, resultFrag, ingredients){
    $.ajax({
        url:"/recipe/ingredient",
        data: {"path" : path, "resultFrag" : resultFrag, "ingredients" : ingredients},
        type:"POST",
        cache: false
    }).done(function (fragment){
        $("#" + resultFrag).replaceWith(fragment);
    });
}

function getRecipeModalAx(path, resultFrag, rcpName){
    $.ajax({
        url:"/recipe/modal",
        data: {"path" : path, "resultFrag" : resultFrag, "rcpName" : rcpName},
        type:"POST",
        cache: false
    }).done(function (fragment){
        $("#" + resultFrag).replaceWith(fragment);
    });
}