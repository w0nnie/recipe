function getproductAX(path, resultFrag, name){
    $.ajax({
        url:"/recipe/search",
        data: {"path" : path, "name" : name, "resultFrag" : resultFrag},
        type:"POST",
        cache: false
    }).done(function (fragment){
        $("#" + resultFrag).replaceWith(fragment);
    });

}