all_images = ["#{resource['images/img_slide/cxovelebi.png']}",
    "#{resource['images/img_slide/avto.png']}",
    "#{resource['images/img_slide/fentezi.png']}",
    "#{resource['images/img_slide/kino.png']}",
    "#{resource['images/img_slide/musika.png']}",
    "#{resource['images/img_slide/smailebi.png']}",
    "#{resource['images/img_slide/siyvaruli.png']}",
    "#{resource['images/img_slide/tamashebi.png']}"
];
var ImgNum = 0;
var ImgLength = all_images.length - 1;
var delay = 2500;
var lock = false;
var run;

function chgImg(direction) {
    if (document.images) {
        ImgNum = ImgNum + direction;
        if (ImgNum > ImgLength) {
            ImgNum = 0;
        }
        if (ImgNum &lt; 0) {
            ImgNum = ImgLength;
        }
        setTimeout("document.getElementsByName('slide_show').src= all_images[ImgNum]");
        // document.getElementsByName().src = all_images[ImgNum];
    }
}

function auto() {
    if (lock == true) {
        lock = false;
        window.clearInterval(run);
    }
    else if (lock == false) {
        lock = true;
        run = setInterval("chgImg(1)", delay);
    }
}