/**
 * Created by Admin on 2017/6/13.
 */

define(function(require, exports){
    
    var vm = new Vue({
        el: '#form',
        data: {
            username      : 'Ala',
            gender        : 'man',
            hobby         : [],
            address       : 'JiangSu'

        },
        methods: {
            submit: function () {
                var self = this;
                Vue.http.options.emulateJSON = true;
                console.log(self.$data,self.hobby,self.hobby.length);
                var hobby = "";
                for(var i = 0 ;i < self.hobby.length;i ++){
                    hobby+=self.hobby[i]+ ",";
                }
                console.log(hobby);
                if(hobby != ""){
                    hobby = hobby.substring(0,hobby.length - 1);
                }
                var formdata = {
                    username:self.username,
                    gender:self.gender,
                    address:self.address,
                    hobby:hobby
                };
                console.log(formdata);
                self.$http.post('/test/vuejs.do',formdata).then(function (response) {
                    console.log(response.data);
                }, function (error) {
                    console.log(error);
                });
            }
        }

    });
});



