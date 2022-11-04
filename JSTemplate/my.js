var mangdl = [
    {
        id:1,
        anh: "https://w0.peakpx.com/wallpaper/538/523/HD-wallpaper-itadori-yuji-itadori-jujutsu-kaisen-jujutsu-jujutsu-kaisen-jujutsu-kaisen-itadori-jujutsu-kaisen-jujutsu-yuji-itadori-thumbnail.jpg",
        ten: "Ichigo",
        noidungcm: " A despondent high school student enrolls in Jujutsu High so he can break the violent curse haunting him"
    },
    {
        id:2,
        anh: "https://w0.peakpx.com/wallpaper/334/580/HD-wallpaper-sukuna-curse-demon-jujutsu-jujutsu-kaisen-thumbnail.jpg",
        ten: "jojo",
        noidungcm: " A despondent high school student enrolls in Jujutsu High so he can break the violent curse haunting him"
    },
];

//Dung template String


for (let index = 0; index < mangdl.length; index++) {
    var nd1 = `<div class="kcm" id="kcm-${mangdl[index].id}">
    <img src="${mangdl[index].anh}" alt="">
    <p>${mangdl[index].ten}</p>
    <p>${mangdl[index].noidungcm}</p>
   </div>`;
    console.log(nd1);
}