/**
 * Created by Admin on 2017/6/13.
 */
define(function (require,exports) {
    
    var buton = document.getElementById("sub");
    buton.onclick= function ajaxTest() {
        $.ajax({
            data: "username=" + $("#username").val() + "&password=" + $("#password").val(),
            type: "post",
            dataType: 'json',
//                url: "/user/request.do?t=" + new Date().getMilliseconds(),
               url: "/user/login.do?t=" + new Date().getMilliseconds(),
//             url: "/user/bean.do?t=" + new Date().getMilliseconds(),
            error: function (data) {
                alert("出错:" + data.message );
            },

            success: function (data) {
                alert(data.message);
//                    alert(data.message);
                $("#result").html(data.message);
            }
        });
    }
});