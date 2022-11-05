var ul = document.getElementsByTagName("ul");
var a = document.getElementsByClassName("nut");
var b = document.getElementsByTagName("input");
// em tạo 1 list cứng để đổ dữ liệu lên web, nhiệm vụ đẩy list 
//này lên sever hoặc lấy list này về cho js dùng là nhiệm vụ của 
//back end
var myList = [
    {
        content: "best java",
        status: "completed",
        class: "alert alert-success justify-content-between d-flex"
    },
    {
        content: "best js",
        status: "",
        class: "alert alert-warning justify-content-between d-flex"
    },
    {
        content: "best om2m",
        status: "",
        class: "alert alert-warning justify-content-between d-flex"
    },
]

// hàm reder để rend dữ liệu từ list ra web
function render() {
    var innerHTML = myList.map(function (item) {
        return `<li class="${item.class}">${item.content} ${item.status}<div class="x-icon"><i class="fa fa-times"></i></div></li>`;
    })
    ul[0].innerHTML = innerHTML.join("");
}

// render lần đầu khi truy cập website
render();

// định nghĩa các sự kiện dùng onclick
a[0].onclick = function () {
    function newObject() { };
    var newObjectListItem = new newObject();
    newObject.prototype.content = b[0].value;
    newObject.prototype.status = "";
    newObject.prototype.class = "alert alert-warning justify-content-between d-flex";
    myList.push(newObjectListItem);
    render();
    b[0].value = "";
}

function myEnter(e) {
    if (e.keyCode == 13) {
        a[0].click();
    }
}

// định nghĩa sự kiện dùng onclick kết hợp với taget vì đây là các 
// dữ liệu động, không thể chỉ dùng mỗi onclick như trên được
ul[0].addEventListener("click", function (e) {
    if (e.target && e.target.className == "fa fa-times") {
        var listLiObj = document.getElementsByTagName("li");
        for (var i = 0; i < listLiObj.length; i++) {
            if (listLiObj[i] == e.target.parentNode.parentNode) {
                myList.splice(i, 1);
                render();
            }
        }
    }
});

ul[0].addEventListener("click", function (e) {
    if ((e.target && e.target.className == "alert alert-warning justify-content-between d-flex" ||(e.target && e.target.className == "" ))) {
        let listLiObj = document.getElementsByTagName("li");
        for (var i = 0; i < listLiObj.length; i++) {
            if (listLiObj[i] == e.target) {
                myList[i].status = "completed";
                myList[i].class = "alert alert-success justify-content-between d-flex";
                render();
            }
        }
    }
    if (e.target && e.target.className == "alert alert-success justify-content-between d-flex") {
        let listLiObj = document.getElementsByTagName("li");
        for (var i = 0; i < listLiObj.length; i++) {
            if (listLiObj[i] == e.target) {
                myList[i].status = "";
                myList[i].class = "alert alert-warning justify-content-between d-flex";
                render();
            }
        }
    }
});