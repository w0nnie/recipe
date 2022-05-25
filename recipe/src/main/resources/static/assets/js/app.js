const range = document.getElementById("jsRange");
const way = document.getElementById("way");
const type = document.getElementById("type");
const name = document.getElementById("name");

function rangeChange(){
    console.log("hi");
    // console.log(way.value);
    // console.log(type.value);
}

function getproduct(){
    console.log(name);
}

range.addEventListener("change",rangeChange);
