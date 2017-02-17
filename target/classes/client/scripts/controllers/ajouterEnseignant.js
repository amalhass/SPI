/**
 * Created by DOSI on 17/02/2017.
 */
'use strict';

angular.module('app').controller('EnseignantAddCtrl', ['$scope','$routeParams','ServiceEnseignant' ,function ($scope,$routeParams,ServiceEnseignant) {
    $scope.enseignant={
        noEnseignant: "",
        type: "",
        sexe: "",
        nom: "",
        prenom: "",
        adresse: "",
        codePostal: "",
        ville: "",
        pays: "",
        mobile: "",
        telephone: "",
        emailUbo: "",
        emailPerso: ""
    }
    $scope.addEnseignant=function () {

        $scope.enseignant["Content-Type"]="application/json";
        ServiceEnseignant.addEnseignant($scope.enseignant);
    }






}]);