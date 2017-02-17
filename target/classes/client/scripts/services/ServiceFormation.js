/**
 * Created by DOSI on 14/02/2017.
 */
angular.module('app')
    .service('ServiceFormation',[ '$http' ,'$location','$route', function ($http,$location,$route) {
        this.getAllFormation = function(callback){

            var url = "/formation";

            $http.get(url).then(function(response){
                callback(response.data);
            });
        };
        this.getOneFormation = function(codeFormation,callback){

            var url = "/formation/"+codeFormation;

            $http.get(url).then(function(response){
                callback(response.data);
            });
        };
        this.addFormation=function (formation) {
            var addUrl="/formation/ajouter";
            $http({
                method: "POST",
                url: addUrl,
                data: formation
            }).success(function (response) {
                console.log(response);
                $location.path("/Clientformation");

            })

        };
        this.deleteFormation=function (codeFormation) {
            var deleteUrl="/formation/supprimer";
            $http({
                method: "DELETE",
                url: deleteUrl,
                data: codeFormation
            }).success(function (response) {
                $route.reload();


            })
        };
        this.updateFormation=function (formation) {
            var updateUrl="formation/update";
            $http( {
                method:"PUT",
                url: updateUrl,
                data: formation
            }).success(function (response) {
                console.log(response);
                $location.path("/Clientformation");

            })

        }
    }]);