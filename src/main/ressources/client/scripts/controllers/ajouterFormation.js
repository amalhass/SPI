/**
 * Created by DOSI on 13/02/2017.
 */
'use strict';

angular.module('app').controller('FormationAddCtrl', ['$scope','$routeParams','ServiceFormation' ,function ($scope,$routeParams,ServiceFormation) {
$scope.formation={
    codeFormation: "",
    debutAccrediation: "",
    diplome: "",
    doubleDiplome: "",
    finAccrediation: "",
    n0Annee: "",
    nomFormation: ""
}
$scope.addFormation=function () {

    $scope.formation["Content-Type"]="application/json";
    ServiceFormation.addFormation($scope.formation);
}






}]);