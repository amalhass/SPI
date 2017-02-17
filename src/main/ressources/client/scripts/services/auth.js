/**
 * Created by DOSI on 16/02/2017.
 */
angular.module("app").factory('AuthService',function($http,$window){
    return{
        authLocal:function (requestAuth) {
            config={
                url:"/auth",
                method:"POST",
                data:requestAuth
            };
            return $http(config);
        },

       getUser : function() {
        config={
            url:"/user",
            method:"GET"

        };
        return $http(config);

    },
        deconnexion : function(){
    config={
        url:"/deconnexion",
        method:"GET"
    }
    return $http(config);
    }
    }

})