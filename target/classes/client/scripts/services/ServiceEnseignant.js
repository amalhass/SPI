/**
 * Created by DOSI on 16/02/2017.
 */
angular.module('app')
    .service('ServiceEnseignant',[ '$http' ,'$location','$route', function ($http,$location,$route) {
        this.getAllEnseignant = function(callback){

            var url = "/enseignant";

            $http.get(url).then(function(response){
                callback(response.data);
            });
        };
        this.getOneEnseignant = function(noEnseignant,callback){

            var url = "/enseignant/"+noEnseignant;

            $http.get(url).then(function(response){
                callback(response.data);
            });
        };
        this.addEnseignant=function (enseignant) {
            var addUrl="/enseignant/ajouter";
            $http({
                method: "POST",
                url: addUrl,
                data: enseignant
            }).success(function (response) {
                console.log(response);
                $location.path("/Clientenseignant");

            })

        };
        this.deleteEnseignant=function (noEnseignant) {
            var deleteUrl="/enseignant/supprimer/"+noEnseignant;
            $http({
                method: "DELETE",
                url: deleteUrl,
                data: noEnseignant
            }).success(function (response) {
                $route.reload();


            })
        };
        this.updateEnseignant=function (enseignant) {
            var updateUrl="enseignant/update";
            $http( {
                method:"PUT",
                url: updateUrl,
                data: enseignant
            }).success(function (response) {
                console.log(response);
                $location.path("/Clientenseignant");

            })

        }
    }]);