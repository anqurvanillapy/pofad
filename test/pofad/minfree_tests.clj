(ns pofad.minfree-tests
  (:require [clojure.test :refer :all]
            [pofad.minfree :refer :all]))

(deftest minfree-range-n
  (testing "Numbers in range [0..n-1]."
    (is (= (minfree [0 1 2]) 3))))

(deftest minfree-not-range-n
  (testing "No numbers in range [0..n-1]."
    (is (= (minfree [3 4 5]) 0))))

(deftest minfree-some-range-n
  (testing "Some numbers in range [0..n-1]."
    (is (= (minfree [0 2 4]) 1))))
